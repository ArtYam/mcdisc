//package com.lambdanum.mcdisc.playback.network;
//
//import io.netty.buffer.ByteBuf;
//import java.nio.charset.Charset;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
//
//public class PortableJukeboxPlayPacket implements IMessage {
//
//  public String sourcePlayer;
//  public String soundId;
//
//  // Used for deserialization
//  public PortableJukeboxPlayPacket() {
//  }
//
//  public PortableJukeboxPlayPacket(String sourcePlayer, String soundId) {
//    this.sourcePlayer = sourcePlayer;
//    this.soundId = soundId;
//  }
//
//  @Override
//  public void fromBytes(ByteBuf buf) {
//    int sourcePlayerLength = buf.readInt();
//    int soundIdLength = buf.readInt();
//    sourcePlayer = buf.readCharSequence(sourcePlayerLength, Charset.defaultCharset()).toString();
//    soundId = buf.readCharSequence(soundIdLength, Charset.defaultCharset()).toString();
//  }
//
//  @Override
//  public void toBytes(ByteBuf buf) {
//    buf.writeInt(sourcePlayer.length());
//    buf.writeInt(soundId.length());
//    buf.writeCharSequence(sourcePlayer, Charset.defaultCharset());
//    buf.writeCharSequence(soundId, Charset.defaultCharset());
//  }
//}
