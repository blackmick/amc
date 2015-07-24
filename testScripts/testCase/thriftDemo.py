#! /usr/bin/env python

import sys
sys.path.append('../gen-py')

from query import querySerivce
from query import ttypes

from thrift import Thrift
from thrift.transport import TSocket
from thrift.transport import TTransport
from thrift.protocol import TMultiplexedProtocol
from thrift.protocol import TBinaryProtocol

__author__ = 'shawn'

try:
    socket = TSocket.TSocket('127.0.0.1', 8082)
    transport = TTransport.TBufferedTransport(socket)
    p = TBinaryProtocol.TBinaryProtocol(transport)
    protocol = TMultiplexedProtocol.TMultiplexedProtocol(p,'QueryService')
    client = querySerivce.Client(protocol)
    transport.open()

    query = ttypes.queryRequest('1','2','3', False)
    print 'client - isExist'
    print 'server - isExist: %s' % (client.getBaseInfo(query))

except Thrift.TException, ex:
    print '%s' % (ex.message)