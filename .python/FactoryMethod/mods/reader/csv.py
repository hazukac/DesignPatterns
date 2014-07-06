
class CsvReader:

  __src_path = './src/'
  __filename = ''
  __handler  = ''
  __f_suffix = '.csv'

  def __init__(self, filename):
    try:
      open(self.__src_path + filename + self.__f_suffix)
    except:
      raise
    self.__filename = filename

  def read(self):
    self.__handler = open(self.__filename)

