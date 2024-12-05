import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;

public class xq {
   private static final byte[] if = new byte[4096];
   private final File a;
   private RandomAccessFile byte;
   private final int[] try = new int[1024];
   private final int[] new = new int[1024];
   private ArrayList int;
   private int for;
   private long do = 0L;

   public xq(File var1) {
      this.a = var1;
      this.for = 0;

      try {
         if (var1.exists()) {
            this.do = var1.lastModified();
         }

         this.byte = new RandomAccessFile(var1, "rw");
         int var2;
         if (this.byte.length() < 4096L) {
            for(var2 = 0; var2 < 1024; ++var2) {
               this.byte.writeInt(0);
            }

            for(var2 = 0; var2 < 1024; ++var2) {
               this.byte.writeInt(0);
            }

            this.for += 8192;
         }

         if ((this.byte.length() & 4095L) != 0L) {
            for(var2 = 0; (long)var2 < (this.byte.length() & 4095L); ++var2) {
               this.byte.write(0);
            }
         }

         var2 = (int)this.byte.length() / 4096;
         this.int = new ArrayList(var2);

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            this.int.add(true);
         }

         this.int.set(0, false);
         this.int.set(1, false);
         this.byte.seek(0L);

         int var4;
         for(var3 = 0; var3 < 1024; ++var3) {
            var4 = this.byte.readInt();
            this.try[var3] = var4;
            if (var4 != 0 && (var4 >> 8) + (var4 & 255) <= this.int.size()) {
               for(int var5 = 0; var5 < (var4 & 255); ++var5) {
                  this.int.set((var4 >> 8) + var5, false);
               }
            }
         }

         for(var3 = 0; var3 < 1024; ++var3) {
            var4 = this.byte.readInt();
            this.new[var3] = var4;
         }
      } catch (IOException var6) {
         var6.printStackTrace();
      }

   }

   public synchronized DataInputStream int(int var1, int var2) {
      if (this.do(var1, var2)) {
         return null;
      } else {
         try {
            int var3 = this.for(var1, var2);
            if (var3 == 0) {
               return null;
            } else {
               int var4 = var3 >> 8;
               int var5 = var3 & 255;
               if (var4 + var5 > this.int.size()) {
                  return null;
               } else {
                  this.byte.seek((long)(var4 * 4096));
                  int var6 = this.byte.readInt();
                  if (var6 > 4096 * var5) {
                     return null;
                  } else if (var6 <= 0) {
                     return null;
                  } else {
                     byte var7 = this.byte.readByte();
                     byte[] var8;
                     if (var7 == 1) {
                        var8 = new byte[var6 - 1];
                        this.byte.read(var8);
                        return new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(var8))));
                     } else if (var7 == 2) {
                        var8 = new byte[var6 - 1];
                        this.byte.read(var8);
                        return new DataInputStream(new BufferedInputStream(new InflaterInputStream(new ByteArrayInputStream(var8))));
                     } else {
                        return null;
                     }
                  }
               }
            }
         } catch (IOException var9) {
            return null;
         }
      }
   }

   public DataOutputStream if(int var1, int var2) {
      return this.do(var1, var2) ? null : new DataOutputStream(new DeflaterOutputStream(new xp(this, var1, var2)));
   }

   protected synchronized void a(int var1, int var2, byte[] var3, int var4) {
      try {
         int var5 = this.for(var1, var2);
         int var6 = var5 >> 8;
         int var7 = var5 & 255;
         int var8 = (var4 + 5) / 4096 + 1;
         if (var8 >= 256) {
            return;
         }

         if (var6 != 0 && var7 == var8) {
            this.a(var6, var3, var4);
         } else {
            int var9;
            for(var9 = 0; var9 < var7; ++var9) {
               this.int.set(var6 + var9, true);
            }

            var9 = this.int.indexOf(true);
            int var10 = 0;
            int var11;
            if (var9 != -1) {
               for(var11 = var9; var11 < this.int.size(); ++var11) {
                  if (var10 != 0) {
                     if ((Boolean)this.int.get(var11)) {
                        ++var10;
                     } else {
                        var10 = 0;
                     }
                  } else if ((Boolean)this.int.get(var11)) {
                     var9 = var11;
                     var10 = 1;
                  }

                  if (var10 >= var8) {
                     break;
                  }
               }
            }

            if (var10 >= var8) {
               var6 = var9;
               this.a(var1, var2, var9 << 8 | var8);

               for(var11 = 0; var11 < var8; ++var11) {
                  this.int.set(var6 + var11, false);
               }

               this.a(var6, var3, var4);
            } else {
               this.byte.seek(this.byte.length());
               var6 = this.int.size();

               for(var11 = 0; var11 < var8; ++var11) {
                  this.byte.write(if);
                  this.int.add(false);
               }

               this.for += 4096 * var8;
               this.a(var6, var3, var4);
               this.a(var1, var2, var6 << 8 | var8);
            }
         }

         this.if(var1, var2, (int)(System.currentTimeMillis() / 1000L));
      } catch (IOException var12) {
         var12.printStackTrace();
      }

   }

   private void a(int var1, byte[] var2, int var3) {
      this.byte.seek((long)(var1 * 4096));
      this.byte.writeInt(var3 + 1);
      this.byte.writeByte(2);
      this.byte.write(var2, 0, var3);
   }

   private boolean do(int var1, int var2) {
      return var1 < 0 || var1 >= 32 || var2 < 0 || var2 >= 32;
   }

   private int for(int var1, int var2) {
      return this.try[var1 + var2 * 32];
   }

   public boolean a(int var1, int var2) {
      return this.for(var1, var2) != 0;
   }

   private void a(int var1, int var2, int var3) {
      this.try[var1 + var2 * 32] = var3;
      this.byte.seek((long)((var1 + var2 * 32) * 4));
      this.byte.writeInt(var3);
   }

   private void if(int var1, int var2, int var3) {
      this.new[var1 + var2 * 32] = var3;
      this.byte.seek((long)(4096 + (var1 + var2 * 32) * 4));
      this.byte.writeInt(var3);
   }

   public void a() {
      if (this.byte != null) {
         this.byte.close();
      }

   }
}
