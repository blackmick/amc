/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.baidu.fpu.usercenter.model.dto;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-7-30")
public class UpdateRequest implements org.apache.thrift.TBase<UpdateRequest, UpdateRequest._Fields>, java.io.Serializable, Cloneable, Comparable<UpdateRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UpdateRequest");

  private static final org.apache.thrift.protocol.TField CHANNEL_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("channelId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField CHANNEL_UID_FIELD_DESC = new org.apache.thrift.protocol.TField("channelUid", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("data", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new UpdateRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new UpdateRequestTupleSchemeFactory());
  }

  public long channelId; // required
  public long channelUid; // required
  public com.baidu.fpu.usercenter.model.dto.UserData data; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CHANNEL_ID((short)1, "channelId"),
    CHANNEL_UID((short)2, "channelUid"),
    DATA((short)3, "data");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CHANNEL_ID
          return CHANNEL_ID;
        case 2: // CHANNEL_UID
          return CHANNEL_UID;
        case 3: // DATA
          return DATA;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CHANNELID_ISSET_ID = 0;
  private static final int __CHANNELUID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CHANNEL_ID, new org.apache.thrift.meta_data.FieldMetaData("channelId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CHANNEL_UID, new org.apache.thrift.meta_data.FieldMetaData("channelUid", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DATA, new org.apache.thrift.meta_data.FieldMetaData("data", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.baidu.fpu.usercenter.model.dto.UserData.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UpdateRequest.class, metaDataMap);
  }

  public UpdateRequest() {
  }

  public UpdateRequest(
    long channelId,
    long channelUid,
    com.baidu.fpu.usercenter.model.dto.UserData data)
  {
    this();
    this.channelId = channelId;
    setChannelIdIsSet(true);
    this.channelUid = channelUid;
    setChannelUidIsSet(true);
    this.data = data;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UpdateRequest(UpdateRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.channelId = other.channelId;
    this.channelUid = other.channelUid;
    if (other.isSetData()) {
      this.data = new com.baidu.fpu.usercenter.model.dto.UserData(other.data);
    }
  }

  public UpdateRequest deepCopy() {
    return new UpdateRequest(this);
  }

  @Override
  public void clear() {
    setChannelIdIsSet(false);
    this.channelId = 0;
    setChannelUidIsSet(false);
    this.channelUid = 0;
    this.data = null;
  }

  public long getChannelId() {
    return this.channelId;
  }

  public UpdateRequest setChannelId(long channelId) {
    this.channelId = channelId;
    setChannelIdIsSet(true);
    return this;
  }

  public void unsetChannelId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CHANNELID_ISSET_ID);
  }

  /** Returns true if field channelId is set (has been assigned a value) and false otherwise */
  public boolean isSetChannelId() {
    return EncodingUtils.testBit(__isset_bitfield, __CHANNELID_ISSET_ID);
  }

  public void setChannelIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CHANNELID_ISSET_ID, value);
  }

  public long getChannelUid() {
    return this.channelUid;
  }

  public UpdateRequest setChannelUid(long channelUid) {
    this.channelUid = channelUid;
    setChannelUidIsSet(true);
    return this;
  }

  public void unsetChannelUid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CHANNELUID_ISSET_ID);
  }

  /** Returns true if field channelUid is set (has been assigned a value) and false otherwise */
  public boolean isSetChannelUid() {
    return EncodingUtils.testBit(__isset_bitfield, __CHANNELUID_ISSET_ID);
  }

  public void setChannelUidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CHANNELUID_ISSET_ID, value);
  }

  public com.baidu.fpu.usercenter.model.dto.UserData getData() {
    return this.data;
  }

  public UpdateRequest setData(com.baidu.fpu.usercenter.model.dto.UserData data) {
    this.data = data;
    return this;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been assigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CHANNEL_ID:
      if (value == null) {
        unsetChannelId();
      } else {
        setChannelId((Long)value);
      }
      break;

    case CHANNEL_UID:
      if (value == null) {
        unsetChannelUid();
      } else {
        setChannelUid((Long)value);
      }
      break;

    case DATA:
      if (value == null) {
        unsetData();
      } else {
        setData((com.baidu.fpu.usercenter.model.dto.UserData)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CHANNEL_ID:
      return Long.valueOf(getChannelId());

    case CHANNEL_UID:
      return Long.valueOf(getChannelUid());

    case DATA:
      return getData();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CHANNEL_ID:
      return isSetChannelId();
    case CHANNEL_UID:
      return isSetChannelUid();
    case DATA:
      return isSetData();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UpdateRequest)
      return this.equals((UpdateRequest)that);
    return false;
  }

  public boolean equals(UpdateRequest that) {
    if (that == null)
      return false;

    boolean this_present_channelId = true;
    boolean that_present_channelId = true;
    if (this_present_channelId || that_present_channelId) {
      if (!(this_present_channelId && that_present_channelId))
        return false;
      if (this.channelId != that.channelId)
        return false;
    }

    boolean this_present_channelUid = true;
    boolean that_present_channelUid = true;
    if (this_present_channelUid || that_present_channelUid) {
      if (!(this_present_channelUid && that_present_channelUid))
        return false;
      if (this.channelUid != that.channelUid)
        return false;
    }

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_channelId = true;
    list.add(present_channelId);
    if (present_channelId)
      list.add(channelId);

    boolean present_channelUid = true;
    list.add(present_channelUid);
    if (present_channelUid)
      list.add(channelUid);

    boolean present_data = true && (isSetData());
    list.add(present_data);
    if (present_data)
      list.add(data);

    return list.hashCode();
  }

  @Override
  public int compareTo(UpdateRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetChannelId()).compareTo(other.isSetChannelId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChannelId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.channelId, other.channelId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetChannelUid()).compareTo(other.isSetChannelUid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChannelUid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.channelUid, other.channelUid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetData()).compareTo(other.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data, other.data);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("UpdateRequest(");
    boolean first = true;

    sb.append("channelId:");
    sb.append(this.channelId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("channelUid:");
    sb.append(this.channelUid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("data:");
    if (this.data == null) {
      sb.append("null");
    } else {
      sb.append(this.data);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'channelId' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'channelUid' because it's a primitive and you chose the non-beans generator.
    if (data == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'data' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (data != null) {
      data.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UpdateRequestStandardSchemeFactory implements SchemeFactory {
    public UpdateRequestStandardScheme getScheme() {
      return new UpdateRequestStandardScheme();
    }
  }

  private static class UpdateRequestStandardScheme extends StandardScheme<UpdateRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UpdateRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CHANNEL_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.channelId = iprot.readI64();
              struct.setChannelIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CHANNEL_UID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.channelUid = iprot.readI64();
              struct.setChannelUidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.data = new com.baidu.fpu.usercenter.model.dto.UserData();
              struct.data.read(iprot);
              struct.setDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetChannelId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'channelId' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetChannelUid()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'channelUid' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, UpdateRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CHANNEL_ID_FIELD_DESC);
      oprot.writeI64(struct.channelId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CHANNEL_UID_FIELD_DESC);
      oprot.writeI64(struct.channelUid);
      oprot.writeFieldEnd();
      if (struct.data != null) {
        oprot.writeFieldBegin(DATA_FIELD_DESC);
        struct.data.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UpdateRequestTupleSchemeFactory implements SchemeFactory {
    public UpdateRequestTupleScheme getScheme() {
      return new UpdateRequestTupleScheme();
    }
  }

  private static class UpdateRequestTupleScheme extends TupleScheme<UpdateRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UpdateRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.channelId);
      oprot.writeI64(struct.channelUid);
      struct.data.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UpdateRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.channelId = iprot.readI64();
      struct.setChannelIdIsSet(true);
      struct.channelUid = iprot.readI64();
      struct.setChannelUidIsSet(true);
      struct.data = new com.baidu.fpu.usercenter.model.dto.UserData();
      struct.data.read(iprot);
      struct.setDataIsSet(true);
    }
  }

}

