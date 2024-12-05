package com.jcraft.jorbis;

import java.io.InputStream;
import java.io.RandomAccessFile;

class x$a extends InputStream {
   RandomAccessFile do;
   final String if;
   // $FF: synthetic field
   final com.jcraft.jorbis.x a;

   x$a(com.jcraft.jorbis.x var1, String var2) {
      this.a = var1;
      this.do = null;
      this.if = "r";
      this.do = new RandomAccessFile(var2, "r");
   }

   public int read() {
      return this.do.read();
   }

   public int read(byte[] var1) {
      return this.do.read(var1);
   }

   public int read(byte[] var1, int var2, int var3) {
      return this.do.read(var1, var2, var3);
   }

   public long skip(long var1) {
      return (long)this.do.skipBytes((int)var1);
   }

   public long a() {
      return this.do.length();
   }

   public long if() {
      return this.do.getFilePointer();
   }

   public int available() {
      return this.do.length() == this.do.getFilePointer() ? 0 : 1;
   }

   public void close() {
      this.do.close();
   }

   public synchronized void mark(int var1) {
   }

   public synchronized void reset() {
   }

   public boolean markSupported() {
      return false;
   }

   public void a(long var1) {
      this.do.seek(var1);
   }
}
