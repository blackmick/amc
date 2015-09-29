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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-8-18")
public class DeleteResponse implements org.apache.thrift.TBase<DeleteResponse, DeleteResponse._Fields>, java.io.Serializable, Cloneable, Comparable<DeleteResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DeleteResponse");

  private static final org.apache.thrift.protocol.TField ERR_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("errCode", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField ERR_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("errMessage", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DeleteResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DeleteResponseTupleSchemeFactory());
  }

  public long errCode; // required
  public String errMessage; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ERR_CODE((short)1, "errCode"),
    ERR_MESSAGE((short)2, "errMessage");

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
        case 1: // ERR_CODE
          return ERR_CODE;
        case 2: // ERR_MESSAGE
          return ERR_MESSAGE;
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
  private static final int __ERRCODE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ERR_MESSAGE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERR_CODE, new org.apache.thrift.meta_data.FieldMetaData("errCode", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ERR_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("errMessage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DeleteResponse.class, metaDataMap);
  }

  public DeleteResponse() {
  }

  public DeleteResponse(
    long errCode)
  {
    this();
    this.errCode = errCode;
    setErrCodeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DeleteResponse(DeleteResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    this.errCode = other.errCode;
    if (other.isSetErrMessage()) {
      this.errMessage = other.errMessage;
    }
  }

  public DeleteResponse deepCopy() {
    return new DeleteResponse(this);
  }

  @Override
  public void clear() {
    setErrCodeIsSet(false);
    this.errCode = 0;
    this.errMessage = null;
  }

  public long getErrCode() {
    return this.errCode;
  }

  public DeleteResponse setErrCode(long errCode) {
    this.errCode = errCode;
    setErrCodeIsSet(true);
    return this;
  }

  public void unsetErrCode() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ERRCODE_ISSET_ID);
  }

  /** Returns true if field errCode is set (has been assigned a value) and false otherwise */
  public boolean isSetErrCode() {
    return EncodingUtils.testBit(__isset_bitfield, __ERRCODE_ISSET_ID);
  }

  public void setErrCodeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ERRCODE_ISSET_ID, value);
  }

  public String getErrMessage() {
    return this.errMessage;
  }

  public DeleteResponse setErrMessage(String errMessage) {
    this.errMessage = errMessage;
    return this;
  }

  public void unsetErrMessage() {
    this.errMessage = null;
  }

  /** Returns true if field errMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetErrMessage() {
    return this.errMessage != null;
  }

  public void setErrMessageIsSet(boolean value) {
    if (!value) {
      this.errMessage = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ERR_CODE:
      if (value == null) {
        unsetErrCode();
      } else {
        setErrCode((Long)value);
      }
      break;

    case ERR_MESSAGE:
      if (value == null) {
        unsetErrMessage();
      } else {
        setErrMessage((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ERR_CODE:
      return Long.valueOf(getErrCode());

    case ERR_MESSAGE:
      return getErrMessage();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ERR_CODE:
      return isSetErrCode();
    case ERR_MESSAGE:
      return isSetErrMessage();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DeleteResponse)
      return this.equals((DeleteResponse)that);
    return false;
  }

  public boolean equals(DeleteResponse that) {
    if (that == null)
      return false;

    boolean this_present_errCode = true;
    boolean that_present_errCode = true;
    if (this_present_errCode || that_present_errCode) {
      if (!(this_present_errCode && that_present_errCode))
        return false;
      if (this.errCode != that.errCode)
        return false;
    }

    boolean this_present_errMessage = true && this.isSetErrMessage();
    boolean that_present_errMessage = true && that.isSetErrMessage();
    if (this_present_errMessage || that_present_errMessage) {
      if (!(this_present_errMessage && that_present_errMessage))
        return false;
      if (!this.errMessage.equals(that.errMessage))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_errCode = true;
    list.add(present_errCode);
    if (present_errCode)
      list.add(errCode);

    boolean present_errMessage = true && (isSetErrMessage());
    list.add(present_errMessage);
    if (present_errMessage)
      list.add(errMessage);

    return list.hashCode();
  }

  @Override
  public int compareTo(DeleteResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetErrCode()).compareTo(other.isSetErrCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errCode, other.errCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetErrMessage()).compareTo(other.isSetErrMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errMessage, other.errMessage);
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
    StringBuilder sb = new StringBuilder("DeleteResponse(");
    boolean first = true;

    sb.append("errCode:");
    sb.append(this.errCode);
    first = false;
    if (isSetErrMessage()) {
      if (!first) sb.append(", ");
      sb.append("errMessage:");
      if (this.errMessage == null) {
        sb.append("null");
      } else {
        sb.append(this.errMessage);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'errCode' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
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

  private static class DeleteResponseStandardSchemeFactory implements SchemeFactory {
    public DeleteResponseStandardScheme getScheme() {
      return new DeleteResponseStandardScheme();
    }
  }

  private static class DeleteResponseStandardScheme extends StandardScheme<DeleteResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DeleteResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ERR_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.errCode = iprot.readI64();
              struct.setErrCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ERR_MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.errMessage = iprot.readString();
              struct.setErrMessageIsSet(true);
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
      if (!struct.isSetErrCode()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'errCode' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, DeleteResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ERR_CODE_FIELD_DESC);
      oprot.writeI64(struct.errCode);
      oprot.writeFieldEnd();
      if (struct.errMessage != null) {
        if (struct.isSetErrMessage()) {
          oprot.writeFieldBegin(ERR_MESSAGE_FIELD_DESC);
          oprot.writeString(struct.errMessage);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DeleteResponseTupleSchemeFactory implements SchemeFactory {
    public DeleteResponseTupleScheme getScheme() {
      return new DeleteResponseTupleScheme();
    }
  }

  private static class DeleteResponseTupleScheme extends TupleScheme<DeleteResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DeleteResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.errCode);
      BitSet optionals = new BitSet();
      if (struct.isSetErrMessage()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetErrMessage()) {
        oprot.writeString(struct.errMessage);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DeleteResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.errCode = iprot.readI64();
      struct.setErrCodeIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.errMessage = iprot.readString();
        struct.setErrMessageIsSet(true);
      }
    }
  }

}

