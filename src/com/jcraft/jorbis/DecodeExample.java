package com.jcraft.jorbis;

import java.io.FileInputStream;
import java.io.InputStream;

class DecodeExample {
   static int if = 8192;
   static byte[] a;

   public static void main(String[] var0) {
      Object var1 = System.in;
      if (var0.length > 0) {
         try {
            var1 = new FileInputStream(var0[0]);
         } catch (Exception var28) {
            System.err.println(var28);
         }
      }

      com.jcraft.a.a var2 = new com.jcraft.a.a();
      com.jcraft.a.c var3 = new com.jcraft.a.c();
      com.jcraft.a.b var4 = new com.jcraft.a.b();
      com.jcraft.a.d var5 = new com.jcraft.a.d();
      com.jcraft.jorbis.f var6 = new com.jcraft.jorbis.f();
      com.jcraft.jorbis.y var7 = new com.jcraft.jorbis.y();
      com.jcraft.jorbis.k var8 = new com.jcraft.jorbis.k();
      com.jcraft.jorbis.z var9 = new com.jcraft.jorbis.z(var8);
      int var11 = 0;
      var2.for();

      while(true) {
         boolean var12 = false;
         int var13 = var2.a(4096);
         byte[] var10 = var2.do;

         try {
            var11 = ((InputStream)var1).read(var10, var13, 4096);
         } catch (Exception var26) {
            System.err.println(var26);
            System.exit(-1);
         }

         var2.if(var11);
         if (var2.if(var4) != 1) {
            if (var11 < 4096) {
               var2.int();
               System.err.println("Done.");
               return;
            }

            System.err.println("Input does not appear to be an Ogg bitstream.");
            System.exit(1);
         }

         var3.do(var4.for());
         var6.if();
         var7.do();
         if (var3.do(var4) < 0) {
            System.err.println("Error reading first page of Ogg bitstream data.");
            System.exit(1);
         }

         if (var3.if(var5) != 1) {
            System.err.println("Error reading initial header packet.");
            System.exit(1);
         }

         if (var6.a(var7, var5) < 0) {
            System.err.println("This Ogg bitstream does not contain Vorbis audio data.");
            System.exit(1);
         }

         int var14;
         for(var14 = 0; var14 < 2; var2.if(var11)) {
            label156:
            while(true) {
               int var15;
               do {
                  if (var14 >= 2) {
                     break label156;
                  }

                  var15 = var2.if(var4);
                  if (var15 == 0) {
                     break label156;
                  }
               } while(var15 != 1);

               var3.do(var4);

               while(var14 < 2) {
                  var15 = var3.if(var5);
                  if (var15 == 0) {
                     break;
                  }

                  if (var15 == -1) {
                     System.err.println("Corrupt secondary header.  Exiting.");
                     System.exit(1);
                  }

                  var6.a(var7, var5);
                  ++var14;
               }
            }

            var13 = var2.a(4096);
            var10 = var2.do;

            try {
               var11 = ((InputStream)var1).read(var10, var13, 4096);
            } catch (Exception var25) {
               System.err.println(var25);
               System.exit(1);
            }

            if (var11 == 0 && var14 < 2) {
               System.err.println("End of file before finding all Vorbis headers!");
               System.exit(1);
            }
         }

         byte[][] var29 = var7.int;

         for(int var16 = 0; var16 < var29.length && var29[var16] != null; ++var16) {
            System.err.println(new String(var29[var16], 0, var29[var16].length - 1));
         }

         System.err.println("\nBitstream is " + var6.u + " channel, " + var6.f + "Hz");
         System.err.println("Encoded by: " + new String(var7.try, 0, var7.try.length - 1) + "\n");
         if = 4096 / var6.u;
         var8.a(var6);
         var9.a(var8);
         float[][][] var30 = new float[1][][];
         int[] var31 = new int[var6.u];

         while(!var12) {
            label207:
            while(true) {
               label205:
               while(true) {
                  if (var12) {
                     break label207;
                  }

                  int var17 = var2.if(var4);
                  if (var17 == 0) {
                     break label207;
                  }

                  if (var17 == -1) {
                     System.err.println("Corrupt or missing data in bitstream; continuing...");
                  } else {
                     var3.do(var4);

                     while(true) {
                        do {
                           var17 = var3.if(var5);
                           if (var17 == 0) {
                              if (var4.new() != 0) {
                                 var12 = true;
                              }
                              continue label205;
                           }
                        } while(var17 == -1);

                        if (var9.a(var5) == 0) {
                           var8.a(var9);
                        }

                        int var18;
                        while((var18 = var8.a(var30, var31)) > 0) {
                           float[][] var19 = var30[0];
                           int var20 = var18 < if ? var18 : if;

                           for(var14 = 0; var14 < var6.u; ++var14) {
                              int var21 = var14 * 2;
                              int var22 = var31[var14];

                              for(int var23 = 0; var23 < var20; ++var23) {
                                 int var24 = (int)((double)var19[var14][var22 + var23] * 32767.0D);
                                 if (var24 > 32767) {
                                    var24 = 32767;
                                 }

                                 if (var24 < -32768) {
                                    var24 = -32768;
                                 }

                                 if (var24 < 0) {
                                    var24 |= 32768;
                                 }

                                 a[var21] = (byte)var24;
                                 a[var21 + 1] = (byte)(var24 >>> 8);
                                 var21 += 2 * var6.u;
                              }
                           }

                           System.out.write(a, 0, 2 * var6.u * var20);
                           var8.a(var20);
                        }
                     }
                  }
               }
            }

            if (!var12) {
               var13 = var2.a(4096);
               var10 = var2.do;

               try {
                  var11 = ((InputStream)var1).read(var10, var13, 4096);
               } catch (Exception var27) {
                  System.err.println(var27);
                  System.exit(1);
               }

               var2.if(var11);
               if (var11 == 0) {
                  var12 = true;
               }
            }
         }

         var3.a();
         var9.a();
         var8.a();
         var6.a();
      }
   }

   static {
      a = new byte[if];
   }
}
