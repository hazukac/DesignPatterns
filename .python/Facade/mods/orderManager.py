from mods import *
from dao import *

class OrderManager:

  @classmethod
  def order(self, _order):
    item_dao = ItemDao.get_instance()
    for i,_order_item in _order.get_items().items():
      item_dao.set_aside(_order_item)
    OrderDao.create_order(_order)
