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



class DeleteRequest:
  """
  Attributes:
   - channelId
   - channelUid
  """

  thrift_spec = (
    None, # 0
    (1, TType.STRING, 'channelId', None, None, ), # 1
    (2, TType.STRING, 'channelUid', None, None, ), # 2
  )

  def __init__(self, channelId=None, channelUid=None,):
    self.channelId = channelId
    self.channelUid = channelUid

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
        if ftype == TType.STRING:
          self.channelId = iprot.readString();
        else:
          iprot.skip(ftype)
      elif fid == 2:
        if ftype == TType.STRING:
          self.channelUid = iprot.readString();
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
    oprot.writeStructBegin('DeleteRequest')
    if self.channelId is not None:
      oprot.writeFieldBegin('channelId', TType.STRING, 1)
      oprot.writeString(self.channelId)
      oprot.writeFieldEnd()
    if self.channelUid is not None:
      oprot.writeFieldBegin('channelUid', TType.STRING, 2)
      oprot.writeString(self.channelUid)
      oprot.writeFieldEnd()
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def validate(self):
    if self.channelId is None:
      raise TProtocol.TProtocolException(message='Required field channelId is unset!')
    if self.channelUid is None:
      raise TProtocol.TProtocolException(message='Required field channelUid is unset!')
    return


  def __hash__(self):
    value = 17
    value = (value * 31) ^ hash(self.channelId)
    value = (value * 31) ^ hash(self.channelUid)
    return value

  def __repr__(self):
    L = ['%s=%r' % (key, value)
      for key, value in self.__dict__.iteritems()]
    return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

  def __eq__(self, other):
    return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

  def __ne__(self, other):
    return not (self == other)

class DeleteResponse:
  """
  Attributes:
   - errCode
   - errMessage
  """

  thrift_spec = (
    None, # 0
    (1, TType.I64, 'errCode', None, None, ), # 1
    (2, TType.STRING, 'errMessage', None, None, ), # 2
  )

  def __init__(self, errCode=None, errMessage=None,):
    self.errCode = errCode
    self.errMessage = errMessage

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
          self.errCode = iprot.readI64();
        else:
          iprot.skip(ftype)
      elif fid == 2:
        if ftype == TType.STRING:
          self.errMessage = iprot.readString();
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
    oprot.writeStructBegin('DeleteResponse')
    if self.errCode is not None:
      oprot.writeFieldBegin('errCode', TType.I64, 1)
      oprot.writeI64(self.errCode)
      oprot.writeFieldEnd()
    if self.errMessage is not None:
      oprot.writeFieldBegin('errMessage', TType.STRING, 2)
      oprot.writeString(self.errMessage)
      oprot.writeFieldEnd()
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def validate(self):
    if self.errCode is None:
      raise TProtocol.TProtocolException(message='Required field errCode is unset!')
    return


  def __hash__(self):
    value = 17
    value = (value * 31) ^ hash(self.errCode)
    value = (value * 31) ^ hash(self.errMessage)
    return value

  def __repr__(self):
    L = ['%s=%r' % (key, value)
      for key, value in self.__dict__.iteritems()]
    return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

  def __eq__(self, other):
    return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

  def __ne__(self, other):
    return not (self == other)
