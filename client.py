import os
import json
import socket
import random


def sendMessage(ip, port, message):
	request_sender = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
	request_sender.connect((ip, port))
	request_sender.sendall(message)
	request_sender.close()

#with open("config.json") as json_file:
#	server_data = json.load(json_file)

#ip = server_data["ip"]
#port = server_data["port"]

ip = ""
port = 1100

print ip, port

#request_sender = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
#request_sender.connect((ip, port))
#request_sender.sendall("hi this is a test")

x = 0
while True:
	#text = raw_input()

	y = random.randint(0,100)
	val = str(x) + str(y)

	print val

	sendMessage(ip, port, val)
	x = x + 1
	



