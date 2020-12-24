// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pingpong.proto

package com.maxsam.pingpong.proto;

public interface RequestInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RequestInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>required int32 requestId = 1;</code>
   * @return Whether the requestId field is set.
   */
  boolean hasRequestId();
  /**
   * <code>required int32 requestId = 1;</code>
   * @return The requestId.
   */
  int getRequestId();

  /**
   * <code>required bool failed = 2;</code>
   * @return Whether the failed field is set.
   */
  boolean hasFailed();
  /**
   * <code>required bool failed = 2;</code>
   * @return The failed.
   */
  boolean getFailed();

  /**
   * <code>required bool cancelled = 3;</code>
   * @return Whether the cancelled field is set.
   */
  boolean hasCancelled();
  /**
   * <code>required bool cancelled = 3;</code>
   * @return The cancelled.
   */
  boolean getCancelled();

  /**
   * <code>required string errorText = 4;</code>
   * @return Whether the errorText field is set.
   */
  boolean hasErrorText();
  /**
   * <code>required string errorText = 4;</code>
   * @return The errorText.
   */
  java.lang.String getErrorText();
  /**
   * <code>required string errorText = 4;</code>
   * @return The bytes for errorText.
   */
  com.google.protobuf.ByteString
      getErrorTextBytes();
}
