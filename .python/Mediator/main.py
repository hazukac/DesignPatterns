from mods import *

if __name__ == '__main__':

  room = Chatroom()

  sasaki = User('Sasaki')
  suzuki = User('Suzuki')
  yoshid = User('Yoshid')
  kawata = User('Kawata')
  tajima = User('Tajima')

  room.login(sasaki)
  room.login(yoshid)

  sasaki.send_message(kawata, 'Hi Kawata, how r U?')
  yoshid.send_message(sasaki, 'Is There Kawata?')

  room.login(kawata)

  kawata.send_message(sasaki, 'Hi, did you call me?')

  room.login(suzuki)
  room.login(tajima)

  suzuki.send_message(sasaki, 'I\'m sorry I\'m late...')
  tajima.send_message(yoshid, 'Is there any progress?')
