from mods import *

class ItemDao:

  __instance = None
  __items    = {}

  def __init__(self):
    fp = open('dao/data/item.txt')
    for l in fp:
      (_id, _name, _price) =  l.replace("\n",'').split(',')
      _item = Item(_id,_name,_price)
      self.__items[_item.get_id()] = _item
    fp.close()

  @classmethod
  def get_instance(self):
    if self.__instance is None:
      self.__instance = ItemDao()
    return self.__instance

  def find_by_id(self, _item_id):
    if self.__items.has_key(str(_item_id)):
      return self.__items[str(_item_id)]
    return None

  def set_aside(self, _order_item):
    print "%s is in the box now" % _order_item.get_item().get_name()
