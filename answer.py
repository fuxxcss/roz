import os

sc = 'query/oob/stackoverflow.sc'

target = 'exercise1'

joern = 'joern --script {} --param target={}  '
joern += '--import util/log.sc '

re = os.system(joern.format(sc,target))
print(re)


