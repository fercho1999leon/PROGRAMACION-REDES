#pip install facebook-scraper

from facebook_scraper import get_posts
import pandas as pd
import socket

BUFFER_SIZE = 4096

my_socket = socket.socket(socket.AF_INET,socket.SOCK_STREAM)
my_socket.connect(('localhost',9999))

data = my_socket.recv(BUFFER_SIZE)
nameFacebook = data.decode('utf-8')

data = my_socket.recv(BUFFER_SIZE)
itensFacebook = int(data.decode('utf-8'))


my_socket.close()

facebook = []

for post in get_posts(nameFacebook, pages=itensFacebook):
    #print(post)
    #print(post['time'])
    #print(post['post_id','text','time','image','images','likes','comments','shares','post_url','link'])
    data = [post['post_id'],post['text'],post['time'],post['image'],post['images'],post['likes'],post['comments'],post['shares'],post['post_url'],post['link']]
    data = tuple(data)
    facebook.append(data)

df = pd.DataFrame(facebook,columns = ['post_id','text','time','image','images','likes','comments','shares','post_url','link'])
df.to_csv(path_or_buf = 'src/scriptPython/data/Facebook.csv', index=False) 