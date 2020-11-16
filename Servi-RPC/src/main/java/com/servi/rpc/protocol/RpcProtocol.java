package com.servi.rpc.protocol;

/**
 * @author servi
 * @date 2020/11/16
 *
 */
public class RpcProtocol {
    // 16 bit
    private short magic;
    // 32 bit
    private int length = 0;
    // 16 bit
    private short headLength = 0;
    // 8 bit
    private byte version;
    // 8 bit
    private byte msgType = 0;
    // 32 bit
    private int msgId = 0;
    // 8 bit
    private byte serialization = 0;
    // 请求头不固定长度的扩展字段
    private byte[] headerExtend = null;
    // 请求体
    private byte[] body = null;

    public short getMagic() {
        return magic;
    }

    public void setMagic(short magic) {
        this.magic = magic;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public short getHeadLength() {
        return headLength;
    }

    public void setHeadLength(short headLength) {
        this.headLength = headLength;
    }

    public byte getVersion() {
        return version;
    }

    public void setVersion(byte version) {
        this.version = version;
    }

    public byte getMsgType() {
        return msgType;
    }

    public void setMsgType(byte msgType) {
        this.msgType = msgType;
    }

    public int getMsgId() {
        return msgId;
    }

    public void setMsgId(int msgId) {
        this.msgId = msgId;
    }

    public byte getSerialization() {
        return serialization;
    }

    public void setSerialization(byte serialization) {
        this.serialization = serialization;
    }

    public byte[] getHeaderExtend() {
        return headerExtend;
    }

    public void setHeaderExtend(byte[] headerExtend) {
        this.headerExtend = headerExtend;
    }

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
    }
}
