
class Item:

  __id    = str
  __name  = str
  __price = int

  def __init__(self, _id, _name, _price):
    self.__id    =    _id
    self.__name  =  _name
    self.__price = _price

  def get_id(self):
    return self.__id

  def get_name(self):
    return self.__name

  def get_price(self):
    return self.__price
