#
# Autogenerated by Thrift Compiler (0.9.2)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#
#  options string: py
#

from thrift.Thrift import TType, TMessageType, TException, TApplicationException
import public.ttypes


from thrift.transport import TTransport
from thrift.protocol import TBinaryProtocol, TProtocol
try:
  from thrift.protocol import fastbinary
except:
  fastbinary = None



class CreateRequest:
  """
  Attributes:
   - channelId
   - channelUid
   - data
  """

  thrift_spec = (
    None, # 0
    (1, TType.I64, 'channelId', None, None, ), # 1
    (2, TType.I64, 'channelUid', None, None, ), # 2
    (3, TType.STRUCT, 'data', (public.ttypes.UserData, public.ttypes.UserData.thrift_spec), None, ), # 3
  )

  def __init__(self, channelId=None, channelUid=None, data=None,):
    self.channelId = channelId
    self.channelUid = channelUid
    self.data = data

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
          self.channelId = iprot.readI64();
        else:
          iprot.skip(ftype)
      elif fid == 2:
        if ftype == TType.I64:
          self.channelUid = iprot.readI64();
        else:
          iprot.skip(ftype)
      elif fid == 3:
        if ftype == TType.STRUCT:
          self.data = public.ttypes.UserData()
          self.data.read(iprot)
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
    oprot.writeStructBegin('CreateRequest')
    if self.channelId is not None:
      oprot.writeFieldBegin('channelId', TType.I64, 1)
      oprot.writeI64(self.channelId)
      oprot.writeFieldEnd()
    if self.channelUid is not None:
      oprot.writeFieldBegin('channelUid', TType.I64, 2)
      oprot.writeI64(self.channelUid)
      oprot.writeFieldEnd()
    if self.data is not None:
      oprot.writeFieldBegin('data', TType.STRUCT, 3)
      self.data.write(oprot)
      oprot.writeFieldEnd()
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def validate(self):
    if self.channelId is None:
      raise TProtocol.TProtocolException(message='Required field channelId is unset!')
    if self.channelUid is None:
      raise TProtocol.TProtocolException(message='Required field channelUid is unset!')
    if self.data is None:
      raise TProtocol.TProtocolException(message='Required field data is unset!')
    return


  def __hash__(self):
    value = 17
    value = (value * 31) ^ hash(self.channelId)
    value = (value * 31) ^ hash(self.channelUid)
    value = (value * 31) ^ hash(self.data)
    return value

  def __repr__(self):
    L = ['%s=%r' % (key, value)
      for key, value in self.__dict__.iteritems()]
    return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

  def __eq__(self, other):
    return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

  def __ne__(self, other):
    return not (self == other)

class CreateResponse:
  """
  Attributes:
   - status
   - fbu_id
   - token
  """

  thrift_spec = (
    None, # 0
    (1, TType.I32, 'status', None, None, ), # 1
    (2, TType.I64, 'fbu_id', None, None, ), # 2
    (3, TType.STRING, 'token', None, None, ), # 3
  )

  def __init__(self, status=None, fbu_id=None, token=None,):
    self.status = status
    self.fbu_id = fbu_id
    self.token = token

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
        if ftype == TType.I32:
          self.status = iprot.readI32();
        else:
          iprot.skip(ftype)
      elif fid == 2:
        if ftype == TType.I64:
          self.fbu_id = iprot.readI64();
        else:
          iprot.skip(ftype)
      elif fid == 3:
        if ftype == TType.STRING:
          self.token = iprot.readString();
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
    oprot.writeStructBegin('CreateResponse')
    if self.status is not None:
      oprot.writeFieldBegin('status', TType.I32, 1)
      oprot.writeI32(self.status)
      oprot.writeFieldEnd()
    if self.fbu_id is not None:
      oprot.writeFieldBegin('fbu_id', TType.I64, 2)
      oprot.writeI64(self.fbu_id)
      oprot.writeFieldEnd()
    if self.token is not None:
      oprot.writeFieldBegin('token', TType.STRING, 3)
      oprot.writeString(self.token)
      oprot.writeFieldEnd()
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def validate(self):
    if self.status is None:
      raise TProtocol.TProtocolException(message='Required field status is unset!')
    if self.fbu_id is None:
      raise TProtocol.TProtocolException(message='Required field fbu_id is unset!')
    return


  def __hash__(self):
    value = 17
    value = (value * 31) ^ hash(self.status)
    value = (value * 31) ^ hash(self.fbu_id)
    value = (value * 31) ^ hash(self.token)
    return value

  def __repr__(self):
    L = ['%s=%r' % (key, value)
      for key, value in self.__dict__.iteritems()]
    return '%s(%s)' % (self.__class__.__name__, ', '.join(L))

  def __eq__(self, other):
    return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

  def __ne__(self, other):
    return not (self == other)
