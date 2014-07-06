
class Chatroom:

  __users = []

  def __init__(self):
    pass

  def login(self, user):
    user.set_room(self)

    if user not in self.__users:
      self.__users.append(user)
      print '%s has entered this room!!' % user.get_name()

  def send_message(self, from_user, to_user, mess):
    if to_user in self.__users:
      to_user.receive_message(from_user, mess)
    else:
      print '%s has left this room... :(' % to_user.get_name()
