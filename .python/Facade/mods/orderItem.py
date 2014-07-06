import item

class OrderItem:

  __item   = object
  __amount =    int

  def __init__(self, _item, _amount):
    self.__item   =   _item
    self.__amount = _amount

  def get_item(self):
    return self.__item

  def get_amount(self):
    return self.__amount
