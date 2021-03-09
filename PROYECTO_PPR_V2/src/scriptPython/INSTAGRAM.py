from instascrape import *
import pandas as pd
import os
import socket

#BUFFER_SIZE = 4096

#my_socket = socket.socket(socket.AF_INET,socket.SOCK_STREAM)
#my_socket.connect(('localhost',9999))

#data = my_socket.recv(BUFFER_SIZE)
#nameInstagram = data.decode('utf-8')

#data = my_socket.recv(BUFFER_SIZE)
#itensInstagram = int(data.decode('utf-8'))

profile = Profile('mileycyrus')
profile.scrape()
date = profile.get_recent_posts(5)
instagram = []
for s in date:
    temp = [s.json_dict['id'],s.json_dict['shortcode'],s.json_dict['display_url'],json.dumps(s.json_dict['edge_media_to_comment']),json.dumps(s.json_dict['edge_liked_by'])]
    print (s.json_dict['id'],s.json_dict['shortcode'],s.json_dict['display_url'],json.dumps(s.json_dict['edge_media_to_comment']),json.dumps(s.json_dict['edge_liked_by']))
    print("pwd=%s" % os.getcwd())
    temp = tuple(temp)
    instagram.append(temp)

df = pd.DataFrame(instagram,columns = ['id','shortcode','display_url','edge_media_to_comment','edge_liked_by'])
df.to_csv(path_or_buf = 'src/scriptPython/data/Instagram.csv', index=False) 

#my_socket.close()

