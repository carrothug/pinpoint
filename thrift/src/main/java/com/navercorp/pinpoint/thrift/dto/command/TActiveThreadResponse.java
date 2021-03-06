/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.navercorp.pinpoint.thrift.dto.command;

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
public class TActiveThreadResponse implements org.apache.thrift.TBase<TActiveThreadResponse, TActiveThreadResponse._Fields>, java.io.Serializable, Cloneable, Comparable<TActiveThreadResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TActiveThreadResponse");

  private static final org.apache.thrift.protocol.TField HISTOGRAM_SCHEMA_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("histogramSchemaType", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ACTIVE_THREAD_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("activeThreadCount", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TActiveThreadResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TActiveThreadResponseTupleSchemeFactory());
  }

  private int histogramSchemaType; // required
  private List<Integer> activeThreadCount; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HISTOGRAM_SCHEMA_TYPE((short)1, "histogramSchemaType"),
    ACTIVE_THREAD_COUNT((short)2, "activeThreadCount");

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
        case 1: // HISTOGRAM_SCHEMA_TYPE
          return HISTOGRAM_SCHEMA_TYPE;
        case 2: // ACTIVE_THREAD_COUNT
          return ACTIVE_THREAD_COUNT;
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
  private static final int __HISTOGRAMSCHEMATYPE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HISTOGRAM_SCHEMA_TYPE, new org.apache.thrift.meta_data.FieldMetaData("histogramSchemaType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ACTIVE_THREAD_COUNT, new org.apache.thrift.meta_data.FieldMetaData("activeThreadCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TActiveThreadResponse.class, metaDataMap);
  }

  public TActiveThreadResponse() {
  }

  public TActiveThreadResponse(
    int histogramSchemaType,
    List<Integer> activeThreadCount)
  {
    this();
    this.histogramSchemaType = histogramSchemaType;
    setHistogramSchemaTypeIsSet(true);
    this.activeThreadCount = activeThreadCount;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TActiveThreadResponse(TActiveThreadResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    this.histogramSchemaType = other.histogramSchemaType;
    if (other.isSetActiveThreadCount()) {
      List<Integer> __this__activeThreadCount = new ArrayList<Integer>(other.activeThreadCount);
      this.activeThreadCount = __this__activeThreadCount;
    }
  }

  public TActiveThreadResponse deepCopy() {
    return new TActiveThreadResponse(this);
  }

  @Override
  public void clear() {
    setHistogramSchemaTypeIsSet(false);
    this.histogramSchemaType = 0;
    this.activeThreadCount = null;
  }

  public int getHistogramSchemaType() {
    return this.histogramSchemaType;
  }

  public void setHistogramSchemaType(int histogramSchemaType) {
    this.histogramSchemaType = histogramSchemaType;
    setHistogramSchemaTypeIsSet(true);
  }

  public void unsetHistogramSchemaType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HISTOGRAMSCHEMATYPE_ISSET_ID);
  }

  /** Returns true if field histogramSchemaType is set (has been assigned a value) and false otherwise */
  public boolean isSetHistogramSchemaType() {
    return EncodingUtils.testBit(__isset_bitfield, __HISTOGRAMSCHEMATYPE_ISSET_ID);
  }

  public void setHistogramSchemaTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HISTOGRAMSCHEMATYPE_ISSET_ID, value);
  }

  public int getActiveThreadCountSize() {
    return (this.activeThreadCount == null) ? 0 : this.activeThreadCount.size();
  }

  public java.util.Iterator<Integer> getActiveThreadCountIterator() {
    return (this.activeThreadCount == null) ? null : this.activeThreadCount.iterator();
  }

  public void addToActiveThreadCount(int elem) {
    if (this.activeThreadCount == null) {
      this.activeThreadCount = new ArrayList<Integer>();
    }
    this.activeThreadCount.add(elem);
  }

  public List<Integer> getActiveThreadCount() {
    return this.activeThreadCount;
  }

  public void setActiveThreadCount(List<Integer> activeThreadCount) {
    this.activeThreadCount = activeThreadCount;
  }

  public void unsetActiveThreadCount() {
    this.activeThreadCount = null;
  }

  /** Returns true if field activeThreadCount is set (has been assigned a value) and false otherwise */
  public boolean isSetActiveThreadCount() {
    return this.activeThreadCount != null;
  }

  public void setActiveThreadCountIsSet(boolean value) {
    if (!value) {
      this.activeThreadCount = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HISTOGRAM_SCHEMA_TYPE:
      if (value == null) {
        unsetHistogramSchemaType();
      } else {
        setHistogramSchemaType((Integer)value);
      }
      break;

    case ACTIVE_THREAD_COUNT:
      if (value == null) {
        unsetActiveThreadCount();
      } else {
        setActiveThreadCount((List<Integer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HISTOGRAM_SCHEMA_TYPE:
      return Integer.valueOf(getHistogramSchemaType());

    case ACTIVE_THREAD_COUNT:
      return getActiveThreadCount();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HISTOGRAM_SCHEMA_TYPE:
      return isSetHistogramSchemaType();
    case ACTIVE_THREAD_COUNT:
      return isSetActiveThreadCount();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TActiveThreadResponse)
      return this.equals((TActiveThreadResponse)that);
    return false;
  }

  public boolean equals(TActiveThreadResponse that) {
    if (that == null)
      return false;

    boolean this_present_histogramSchemaType = true;
    boolean that_present_histogramSchemaType = true;
    if (this_present_histogramSchemaType || that_present_histogramSchemaType) {
      if (!(this_present_histogramSchemaType && that_present_histogramSchemaType))
        return false;
      if (this.histogramSchemaType != that.histogramSchemaType)
        return false;
    }

    boolean this_present_activeThreadCount = true && this.isSetActiveThreadCount();
    boolean that_present_activeThreadCount = true && that.isSetActiveThreadCount();
    if (this_present_activeThreadCount || that_present_activeThreadCount) {
      if (!(this_present_activeThreadCount && that_present_activeThreadCount))
        return false;
      if (!this.activeThreadCount.equals(that.activeThreadCount))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_histogramSchemaType = true;
    list.add(present_histogramSchemaType);
    if (present_histogramSchemaType)
      list.add(histogramSchemaType);

    boolean present_activeThreadCount = true && (isSetActiveThreadCount());
    list.add(present_activeThreadCount);
    if (present_activeThreadCount)
      list.add(activeThreadCount);

    return list.hashCode();
  }

  @Override
  public int compareTo(TActiveThreadResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetHistogramSchemaType()).compareTo(other.isSetHistogramSchemaType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHistogramSchemaType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.histogramSchemaType, other.histogramSchemaType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetActiveThreadCount()).compareTo(other.isSetActiveThreadCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetActiveThreadCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.activeThreadCount, other.activeThreadCount);
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
    StringBuilder sb = new StringBuilder("TActiveThreadResponse(");
    boolean first = true;

    sb.append("histogramSchemaType:");
    sb.append(this.histogramSchemaType);
    first = false;
    if (!first) sb.append(", ");
    sb.append("activeThreadCount:");
    if (this.activeThreadCount == null) {
      sb.append("null");
    } else {
      sb.append(this.activeThreadCount);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class TActiveThreadResponseStandardSchemeFactory implements SchemeFactory {
    public TActiveThreadResponseStandardScheme getScheme() {
      return new TActiveThreadResponseStandardScheme();
    }
  }

  private static class TActiveThreadResponseStandardScheme extends StandardScheme<TActiveThreadResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TActiveThreadResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HISTOGRAM_SCHEMA_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.histogramSchemaType = iprot.readI32();
              struct.setHistogramSchemaTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ACTIVE_THREAD_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list32 = iprot.readListBegin();
                struct.activeThreadCount = new ArrayList<Integer>(_list32.size);
                int _elem33;
                for (int _i34 = 0; _i34 < _list32.size; ++_i34)
                {
                  _elem33 = iprot.readI32();
                  struct.activeThreadCount.add(_elem33);
                }
                iprot.readListEnd();
              }
              struct.setActiveThreadCountIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TActiveThreadResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(HISTOGRAM_SCHEMA_TYPE_FIELD_DESC);
      oprot.writeI32(struct.histogramSchemaType);
      oprot.writeFieldEnd();
      if (struct.activeThreadCount != null) {
        oprot.writeFieldBegin(ACTIVE_THREAD_COUNT_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.activeThreadCount.size()));
          for (int _iter35 : struct.activeThreadCount)
          {
            oprot.writeI32(_iter35);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TActiveThreadResponseTupleSchemeFactory implements SchemeFactory {
    public TActiveThreadResponseTupleScheme getScheme() {
      return new TActiveThreadResponseTupleScheme();
    }
  }

  private static class TActiveThreadResponseTupleScheme extends TupleScheme<TActiveThreadResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TActiveThreadResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetHistogramSchemaType()) {
        optionals.set(0);
      }
      if (struct.isSetActiveThreadCount()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetHistogramSchemaType()) {
        oprot.writeI32(struct.histogramSchemaType);
      }
      if (struct.isSetActiveThreadCount()) {
        {
          oprot.writeI32(struct.activeThreadCount.size());
          for (int _iter36 : struct.activeThreadCount)
          {
            oprot.writeI32(_iter36);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TActiveThreadResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.histogramSchemaType = iprot.readI32();
        struct.setHistogramSchemaTypeIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list37 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.activeThreadCount = new ArrayList<Integer>(_list37.size);
          int _elem38;
          for (int _i39 = 0; _i39 < _list37.size; ++_i39)
          {
            _elem38 = iprot.readI32();
            struct.activeThreadCount.add(_elem38);
          }
        }
        struct.setActiveThreadCountIsSet(true);
      }
    }
  }

}

