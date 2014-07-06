from mods import *

class OrderDao:

  @classmethod
  def create_order(self, _order):
    print 'create new order following data bellow...'
    for i,_order_item in _order.get_items().items():
      _item = _order_item.get_item()
      total_price = (int(_item.get_price()) * int(_order_item.get_amount()))
      print "Id\t%s\tName\t%s\tPrice\t%s\tAmount\t%s\tTotal Price\t%s" % (str(_item.get_id()), _item.get_name(), str(_item.get_price()), str(_order_item.get_amount()), str(total_price))
