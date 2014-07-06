import orderItem

class Order:

  __items = dict

  def __init__(self):
    self.__items = {}

  def add_item(self, _order_item):
    self.__items[_order_item.get_item().get_id()] = _order_item

  def get_items(self):
    return self.__items
