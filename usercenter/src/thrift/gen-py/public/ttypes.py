#
# Autogenerated by Thrift Compiler (0.9.2)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#
#  options string: py
#

from thrift.Thrift import TType, TMessageType, TException, TApplicationException

from thrift.transport import TTransport
from thrift.protocol import TBinaryProtocol, TProtocol
try:
  from thrift.protocol import fastbinary
except:
  fastbinary = None



class UserData:
  """
  Attributes:
   - fbuId
   - status
   - name
   - prcid
   - cashCard
   - createBy
   - createTime
   - updateBy
   - updateTime
  """

  thrift_spec = (
    None, # 0
    (1, TType.I64, 'fbuId', None, None, ), # 1
    (2, TType.I32, 'status', None, None, ), # 2
    (3, TType.STRING, 'name', None, None, ), # 3
    (4, TType.STRING, 'prcid', None, None, ), # 4
    (5, TType.STRING, 'cashCard', None, None, ), # 5
    (6, TType.STRING, 'createBy', None, None, ), # 6
    (7, TType.STRING, 'createTime', None, None, ), # 7
    (8, TType.STRING, 'updateBy', None, None, ), # 8
    (9, TType.STRING, 'updateTime', None, None, ), # 9
  )

  def __init__(self, fbuId=None, status=None, name=None, prcid=None, cashCard=None, createBy=None, createTime=None, updateBy=None, updateTime=None,):
    self.fbuId = fbuId
    self.status = status
    self.name = name
    self.prcid = prcid
    self.cashCard = cashCard
    self.createBy = createBy
    self.createTime = createTime
    self.updateBy = updateBy
    self.updateTime = updateTime

  def read(self, iprot):
    if iprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastbinary is not None:
      fastbinary.decode_binary(self, iprot.trans, (self.__class__, self.thrift_spec))
      return
    iprot.readStructBegin()
    while True:
      (fname, ftype, fid) = iprot.readFieldBegin()
      if ftype == TType.STOP:
        break
      if fid == 1:
        if ftype == TType.I64:
          self.fbuId = iprot.readI64();
        else:
          iprot.skip(ftype)
      elif fid == 2:
        if ftype == TType.I32:
          self.status = iprot.readI32();
        else:
          iprot.skip(ftype)
      elif fid == 3:
        if ftype == TType.STRING:
          self.name = iprot.readString();
        else:
          iprot.skip(ftype)
      elif fid == 4:
        if ftype == TType.STRING:
          self.prcid = iprot.readString();
        else:
          iprot.skip(ftype)
      elif fid == 5:
        if ftype == TType.STRING:
          self.cashCard = iprot.readString();
        else:
          iprot.skip(ftype)
      elif fid == 6:
        if ftype == TType.STRING:
          self.createBy = iprot.readString();
        else:
          iprot.skip(ftype)
      elif fid == 7:
        if ftype == TType.STRING:
          self.createTime = iprot.readString();
        else:
          iprot.skip(ftype)
      elif fid == 8:
        if ftype == TType.STRING:
          self.updateBy = iprot.readString();
        else:
          iprot.skip(ftype)
      elif fid == 9:
        if ftype == TType.STRING:
          self.updateTime = iprot.readString();
        else:
          iprot.skip(ftype)
      else:
        iprot.skip(ftype)
      iprot.readFieldEnd()
    iprot.readStructEnd()

  def write(self, oprot):
    if oprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and self.thrift_spec is not None and fastbinary is not None:
      oprot.trans.write(fastbinary.encode_binary(self, (self.__class__, self.thrift_spec)))
      return
    oprot.writeStructBegin('UserData')
    if self.fbuId is not None:
      oprot.writeFieldBegin('fbuId', TType.I64, 1)
      oprot.writeI64(self.fbuId)
      oprot.writeFieldEnd()
    if self.status is not None:
      oprot.writeFieldBegin('status', TType.I32, 2)
      oprot.writeI32(self.status)
      oprot.writeFieldEnd()
    if self.name is not None:
      oprot.writeFieldBegin('name', TType.STRING, 3)
      oprot.writeString(self.name)
      oprot.writeFieldEnd()
    if self.prcid is not None:
      oprot.writeFieldBegin('prcid', TType.STRING, 4)
      oprot.writeString(self.prcid)
      oprot.writeFieldEnd()
    if self.cashCard is not None:
      oprot.writeFieldBegin('cashCard', TType.STRING, 5)
      oprot.writeString(self.cashCard)
      oprot.writeFieldEnd()
    if self.createBy is not None:
      oprot.writeFieldBegin('createBy', TType.STRING, 6)
      oprot.writeString(self.createBy)
      oprot.writeFieldEnd()
    if self.createTime is not None:
      oprot.writeFieldBegin('createTime', TType.STRING, 7)
      oprot.writeString(self.createTime)
      oprot.writeFieldEnd()
    if self.updateBy is not None:
      oprot.writeFieldBegin('updateBy', TType.STRING, 8)
      oprot.writeString(self.updateBy)
      oprot.writeFieldEnd()
    if self.updateTime is not None:
      oprot.writeFieldBegin('updateTime', TType.STRING, 9)
      oprot.writeString(self.updateTime)
      oprot.writeFieldEnd()
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def validate(self):
    if self.fbuId is None:
      raise TProtocol.TProtocolException(message='Required field fbuId is unset!')
    if self.status is None:
      raise TProtocol.TProtocolException(message='Required field status is unset!')
    if self.name is None:
      raise TProtocol.TProtocolException(message='Required field name is unset!')
    if self.prcid is None:
      raise TProtocol.TProtocolException(message='Required field prcid is unset!')
    if self.cashCard is None:
      raise TProtocol.TProtocolException(message='Required field cashCard is unset!')
    return


  def __hash__(self):
    value = 17
    value = (value * 31) ^ hash(self.fbuId)
    value = (value * 31) ^ hash(self.status)
    value = (value * 31) ^ hash(self.name)
    value = (value * 31) ^ hash(self.prcid)
    value = (value * 31) ^ hash(self.cashCard)
    value = (value * 31) ^ hash(self.createBy)
    value = (value * 31) ^ hash(self.createTime)
    value = (value * 31) ^ hash(self.updateBy)
    value = (value * 31) ^ hash(self.updateTime)
    return value

  def __repr__(self):
    L = ['%s=%r' % (key, value)
      for key, value in self.__dict__.iteritems()]
    return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

  def __eq__(self, other):
    return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

  def __ne__(self, other):
    return not (self == other)