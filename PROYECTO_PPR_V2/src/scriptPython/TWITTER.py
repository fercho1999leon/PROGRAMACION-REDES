import tweepy
from tweepy import OAuthHandler
import pandas as pd
import json

import socket
cont = 4
BUFFER_SIZE = 4096

my_socket = socket.socket(socket.AF_INET,socket.SOCK_STREAM)
my_socket.connect(('localhost',9999))
mensaje = 'desde python'

data = my_socket.recv(BUFFER_SIZE)
nameTwitter = data.decode('utf-8')

data = my_socket.recv(BUFFER_SIZE)
itensTwitter = int(data.decode('utf-8'))


my_socket.close()

"""I like to have my python script print a message at the beginning. This helps me confirm whether everything is set up correctly. And it's nice to get an uplifting message ;)."""

print("You got this!")

access_token = '1354197863945932800-mpQfOV7XGeiKePZ5ffWa6CnvTflqpb'
access_token_secret = '4NOLDA5f3hoEue6naZr2eHNlCAmyy7MiEFsOcZfAAz2PB'
consumer_key = 'lJQ9nzL2P8w7Wg8WxPuumtpT8'
consumer_secret = 'Lf68IqugKgHfo7oAxohIJLWmwyyJnrCKsKY855pEMyWtHA7fTv'

auth = tweepy.OAuthHandler(consumer_key, consumer_secret)
auth.set_access_token(access_token, access_token_secret)

api = tweepy.API(auth, wait_on_rate_limit=True, wait_on_rate_limit_notify=True)

tweets = []

count = 1

"""Twitter will automatically sample the last 7 days of data. Depending on how many total tweets there are with the specific hashtag, keyword, handle, or key phrase that you are looking for, you can set the date back further by adding since= as one of the parameters. You can also manually add in the number of tweets you want to get back in the items() section."""

for tweet in tweepy.Cursor(api.user_timeline, screen_name=nameTwitter).items(itensTwitter):
	print(count)
	count += 1
	print (json.dumps(tweet._json,indent=2))
	try: 

		data = [tweet.created_at, tweet.id, tweet.text, tweet.user._json['screen_name'], tweet.user._json['name'], tweet.user._json['created_at'], tweet.entities['urls'],tweet.favorite_count]
		data = tuple(data)
		tweets.append(data)

	except tweepy.TweepError as e:
		print(e.reason)
		continue

	except StopIteration:
		break

df = pd.DataFrame(tweets, columns = ['created_at','tweet_id', 'tweet_text', 'screen_name', 'name', 'account_creation_date', 'urls','like'])

"""Add the path to the folder you want to save the CSV file in as well as what you want the CSV file to be named inside the single quotations"""
df.to_csv(path_or_buf = 'src/scriptPython/data/Twitter.csv', index=False) 
