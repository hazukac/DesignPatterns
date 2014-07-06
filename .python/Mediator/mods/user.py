
class User:

  __name = ''
  __room = ''

  def __init__(self, name):
    self.__name = name

  def get_name(self):
    return self.__name

  def set_room(self, room):
    self.__room = room

  def get_room(self):
    return self.__room

  def send_message(self, to_user, mess):
    self.__room.send_message(self, to_user, mess)

  def receive_message(self, from_user, mess):
      print "From: %s\t To:%s\tMessage:  %s" % (from_user.get_name(), self.__name, mess)
