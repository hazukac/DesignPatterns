from mods import *
from dao import *

class Main:

  @classmethod
  def main(self):
    order = Order()
    item_dao = ItemDao.get_instance()
    order.add_item(OrderItem(item_dao.find_by_id(1),2));
    order.add_item(OrderItem(item_dao.find_by_id(2),1));
    order.add_item(OrderItem(item_dao.find_by_id(3),3));

    OrderManager.order(order)

if __name__ == '__main__':
  Main.main()
