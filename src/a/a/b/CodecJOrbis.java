package a.a.b;

import a.a.ICodec;
import a.a.SoundBuffer;
import a.a.SoundSystemConfig;
import a.a.SoundSystemLogger;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownServiceException;
import javax.sound.sampled.AudioFormat;

public class CodecJOrbis implements ICodec {
   private static final boolean GET = false;
   private static final boolean SET = true;
   private static final boolean XXX = false;
   protected URL url;
   protected URLConnection urlConnection = null;
   private InputStream inputStream;
   private AudioFormat audioFormat;
   private boolean endOfStream = false;
   private boolean initialized = false;
   private byte[] buffer = null;
   private int bufferSize;
   private int count = 0;
   private int index = 0;
   private int convertedBufferSize;
   private byte[] convertedBuffer = null;
   private float[][][] pcmInfo;
   private int[] pcmIndex;
   private com.jcraft.a.d joggPacket = new com.jcraft.a.d();
   private com.jcraft.a.b joggPage = new com.jcraft.a.b();
   private com.jcraft.a.c joggStreamState = new com.jcraft.a.c();
   private com.jcraft.a.a joggSyncState = new com.jcraft.a.a();
   private com.jcraft.jorbis.k jorbisDspState = new com.jcraft.jorbis.k();
   private com.jcraft.jorbis.z jorbisBlock;
   private com.jcraft.jorbis.y jorbisComment;
   private com.jcraft.jorbis.f jorbisInfo;
   private SoundSystemLogger logger;

   public CodecJOrbis() {
      this.jorbisBlock = new com.jcraft.jorbis.z(this.jorbisDspState);
      this.jorbisComment = new com.jcraft.jorbis.y();
      this.jorbisInfo = new com.jcraft.jorbis.f();
      this.logger = SoundSystemConfig.getLogger();
   }

   public void reverseByteOrder(boolean var1) {
   }

   public boolean initialize(URL var1) {
      this.initialized(true, false);
      if (this.joggStreamState != null) {
         this.joggStreamState.a();
      }

      if (this.jorbisBlock != null) {
         this.jorbisBlock.a();
      }

      if (this.jorbisDspState != null) {
         this.jorbisDspState.a();
      }

      if (this.jorbisInfo != null) {
         this.jorbisInfo.a();
      }

      if (this.joggSyncState != null) {
         this.joggSyncState.int();
      }

      if (this.inputStream != null) {
         try {
            this.inputStream.close();
         } catch (IOException var7) {
         }
      }

      this.url = var1;
      this.bufferSize = 8192;
      this.buffer = null;
      this.count = 0;
      this.index = 0;
      this.joggStreamState = new com.jcraft.a.c();
      this.jorbisBlock = new com.jcraft.jorbis.z(this.jorbisDspState);
      this.jorbisDspState = new com.jcraft.jorbis.k();
      this.jorbisInfo = new com.jcraft.jorbis.f();
      this.joggSyncState = new com.jcraft.a.a();

      try {
         this.urlConnection = var1.openConnection();
      } catch (UnknownServiceException var5) {
         this.errorMessage("Unable to create a UrlConnection in method 'initialize'.");
         this.printStackTrace(var5);
         this.cleanup();
         return false;
      } catch (IOException var6) {
         this.errorMessage("Unable to create a UrlConnection in method 'initialize'.");
         this.printStackTrace(var6);
         this.cleanup();
         return false;
      }

      if (this.urlConnection != null) {
         try {
            this.inputStream = this.openInputStream();
         } catch (IOException var4) {
            this.errorMessage("Unable to acquire inputstream in method 'initialize'.");
            this.printStackTrace(var4);
            this.cleanup();
            return false;
         }
      }

      this.endOfStream(true, false);
      this.joggSyncState.for();
      this.joggSyncState.a(this.bufferSize);
      this.buffer = this.joggSyncState.do;

      try {
         if (!this.readHeader()) {
            this.errorMessage("Error reading the header");
            return false;
         }
      } catch (IOException var8) {
         this.errorMessage("Error reading the header");
         return false;
      }

      this.convertedBufferSize = this.bufferSize * 2;
      this.jorbisDspState.a(this.jorbisInfo);
      this.jorbisBlock.a(this.jorbisDspState);
      int var2 = this.jorbisInfo.u;
      int var3 = this.jorbisInfo.f;
      this.audioFormat = new AudioFormat((float)var3, 16, var2, true, false);
      this.pcmInfo = new float[1][][];
      this.pcmIndex = new int[this.jorbisInfo.u];
      this.initialized(true, true);
      return true;
   }

   protected InputStream openInputStream() {
      return this.urlConnection.getInputStream();
   }

   public boolean initialized() {
      return this.initialized(false, false);
   }

   public SoundBuffer read() {
      byte[] var1 = null;

      while(!this.endOfStream(false, false) && (var1 == null || var1.length < SoundSystemConfig.getStreamingBufferSize())) {
         if (var1 == null) {
            var1 = this.readBytes();
         } else {
            var1 = appendByteArrays(var1, this.readBytes());
         }
      }

      return var1 == null ? null : new SoundBuffer(var1, this.audioFormat);
   }

   public SoundBuffer readAll() {
      byte[] var1 = null;

      while(!this.endOfStream(false, false)) {
         if (var1 == null) {
            var1 = this.readBytes();
         } else {
            var1 = appendByteArrays(var1, this.readBytes());
         }
      }

      if (var1 == null) {
         return null;
      } else {
         return new SoundBuffer(var1, this.audioFormat);
      }
   }

   public boolean endOfStream() {
      return this.endOfStream(false, false);
   }

   public void cleanup() {
      this.joggStreamState.a();
      this.jorbisBlock.a();
      this.jorbisDspState.a();
      this.jorbisInfo.a();
      this.joggSyncState.int();
      if (this.inputStream != null) {
         try {
            this.inputStream.close();
         } catch (IOException var2) {
         }
      }

      this.joggStreamState = null;
      this.jorbisBlock = null;
      this.jorbisDspState = null;
      this.jorbisInfo = null;
      this.joggSyncState = null;
      this.inputStream = null;
   }

   public AudioFormat getAudioFormat() {
      return this.audioFormat;
   }

   private boolean readHeader() {
      this.index = this.joggSyncState.a(this.bufferSize);
      int var1 = this.inputStream.read(this.joggSyncState.do, this.index, this.bufferSize);
      if (var1 < 0) {
         var1 = 0;
      }

      this.joggSyncState.if(var1);
      if (this.joggSyncState.if(this.joggPage) != 1) {
         if (var1 < this.bufferSize) {
            return true;
         } else {
            this.errorMessage("Ogg header not recognized in method 'readHeader'.");
            return false;
         }
      } else {
         this.joggStreamState.do(this.joggPage.for());
         this.jorbisInfo.if();
         this.jorbisComment.do();
         if (this.joggStreamState.do(this.joggPage) < 0) {
            this.errorMessage("Problem with first Ogg header page in method 'readHeader'.");
            return false;
         } else if (this.joggStreamState.if(this.joggPacket) != 1) {
            this.errorMessage("Problem with first Ogg header packet in method 'readHeader'.");
            return false;
         } else if (this.jorbisInfo.a(this.jorbisComment, this.joggPacket) < 0) {
            this.errorMessage("File does not contain Vorbis header in method 'readHeader'.");
            return false;
         } else {
            int var2 = 0;

            while(var2 < 2) {
               label73:
               while(true) {
                  int var3;
                  do {
                     if (var2 >= 2) {
                        break label73;
                     }

                     var3 = this.joggSyncState.if(this.joggPage);
                     if (var3 == 0) {
                        break label73;
                     }
                  } while(var3 != 1);

                  this.joggStreamState.do(this.joggPage);

                  while(var2 < 2) {
                     var3 = this.joggStreamState.if(this.joggPacket);
                     if (var3 == 0) {
                        break;
                     }

                     if (var3 == -1) {
                        this.errorMessage("Secondary Ogg header corrupt in method 'readHeader'.");
                        return false;
                     }

                     this.jorbisInfo.a(this.jorbisComment, this.joggPacket);
                     ++var2;
                  }
               }

               this.index = this.joggSyncState.a(this.bufferSize);
               var1 = this.inputStream.read(this.joggSyncState.do, this.index, this.bufferSize);
               if (var1 < 0) {
                  var1 = 0;
               }

               if (var1 == 0 && var2 < 2) {
                  this.errorMessage("End of file reached before finished readingOgg header in method 'readHeader'");
                  return false;
               }

               this.joggSyncState.if(var1);
            }

            this.index = this.joggSyncState.a(this.bufferSize);
            this.buffer = this.joggSyncState.do;
            return true;
         }
      }
   }

   private byte[] readBytes() {
      if (!this.initialized(false, false)) {
         return null;
      } else if (this.endOfStream(false, false)) {
         return null;
      } else {
         if (this.convertedBuffer == null) {
            this.convertedBuffer = new byte[this.convertedBufferSize];
         }

         byte[] var1 = null;
         switch(this.joggSyncState.if(this.joggPage)) {
         default:
            this.joggStreamState.do(this.joggPage);
            if (this.joggPage.int() == 0L) {
               this.endOfStream(true, true);
               return null;
            } else {
               label99:
               while(true) {
                  while(true) {
                     switch(this.joggStreamState.if(this.joggPacket)) {
                     case -1:
                        break;
                     case 0:
                        if (this.joggPage.new() != 0) {
                           this.endOfStream(true, true);
                        }
                        break label99;
                     default:
                        if (this.jorbisBlock.a(this.joggPacket) == 0) {
                           this.jorbisDspState.a(this.jorbisBlock);
                        }

                        int var3;
                        while((var3 = this.jorbisDspState.a(this.pcmInfo, this.pcmIndex)) > 0) {
                           float[][] var2 = this.pcmInfo[0];
                           int var4 = var3 < this.convertedBufferSize ? var3 : this.convertedBufferSize;

                           for(int var8 = 0; var8 < this.jorbisInfo.u; ++var8) {
                              int var5 = var8 * 2;
                              int var6 = this.pcmIndex[var8];

                              for(int var9 = 0; var9 < var4; ++var9) {
                                 int var7 = (int)((double)var2[var8][var6 + var9] * 32767.0D);
                                 if (var7 > 32767) {
                                    var7 = 32767;
                                 }

                                 if (var7 < -32768) {
                                    var7 = -32768;
                                 }

                                 if (var7 < 0) {
                                    var7 |= 32768;
                                 }

                                 this.convertedBuffer[var5] = (byte)var7;
                                 this.convertedBuffer[var5 + 1] = (byte)(var7 >>> 8);
                                 var5 += 2 * this.jorbisInfo.u;
                              }
                           }

                           this.jorbisDspState.a(var4);
                           var1 = appendByteArrays(var1, this.convertedBuffer, 2 * this.jorbisInfo.u * var4);
                        }
                     }
                  }
               }
            }
         case -1:
         case 0:
            if (!this.endOfStream(false, false)) {
               this.index = this.joggSyncState.a(this.bufferSize);
               this.buffer = this.joggSyncState.do;

               try {
                  this.count = this.inputStream.read(this.buffer, this.index, this.bufferSize);
               } catch (Exception var11) {
                  this.printStackTrace(var11);
                  return null;
               }

               if (this.count == -1) {
                  return var1;
               }

               this.joggSyncState.if(this.count);
               if (this.count == 0) {
                  this.endOfStream(true, true);
               }
            }

            return var1;
         }
      }
   }

   private synchronized boolean initialized(boolean var1, boolean var2) {
      if (var1) {
         this.initialized = var2;
      }

      return this.initialized;
   }

   private synchronized boolean endOfStream(boolean var1, boolean var2) {
      if (var1) {
         this.endOfStream = var2;
      }

      return this.endOfStream;
   }

   private static byte[] trimArray(byte[] var0, int var1) {
      byte[] var2 = null;
      if (var0 != null && var0.length > var1) {
         var2 = new byte[var1];
         System.arraycopy(var0, 0, var2, 0, var1);
      }

      return var2;
   }

   private static byte[] appendByteArrays(byte[] var0, byte[] var1, int var2) {
      int var4 = var2;
      if (var1 != null && var1.length != 0) {
         if (var1.length < var2) {
            var4 = var1.length;
         }
      } else {
         var4 = 0;
      }

      if (var0 != null || var1 != null && var4 > 0) {
         byte[] var3;
         Object var6;
         if (var0 == null) {
            var3 = new byte[var4];
            System.arraycopy(var1, 0, var3, 0, var4);
            var6 = null;
         } else {
            Object var5;
            if (var1 != null && var4 > 0) {
               var3 = new byte[var0.length + var4];
               System.arraycopy(var0, 0, var3, 0, var0.length);
               System.arraycopy(var1, 0, var3, var0.length, var4);
               var5 = null;
               var6 = null;
            } else {
               var3 = new byte[var0.length];
               System.arraycopy(var0, 0, var3, 0, var0.length);
               var5 = null;
            }
         }

         return var3;
      } else {
         return null;
      }
   }

   private static byte[] appendByteArrays(byte[] var0, byte[] var1) {
      if (var0 == null && var1 == null) {
         return null;
      } else {
         byte[] var2;
         Object var4;
         if (var0 == null) {
            var2 = new byte[var1.length];
            System.arraycopy(var1, 0, var2, 0, var1.length);
            var4 = null;
         } else {
            Object var3;
            if (var1 == null) {
               var2 = new byte[var0.length];
               System.arraycopy(var0, 0, var2, 0, var0.length);
               var3 = null;
            } else {
               var2 = new byte[var0.length + var1.length];
               System.arraycopy(var0, 0, var2, 0, var0.length);
               System.arraycopy(var1, 0, var2, var0.length, var1.length);
               var3 = null;
               var4 = null;
            }
         }

         return var2;
      }
   }

   private void errorMessage(String var1) {
      this.logger.errorMessage("CodecJOrbis", var1, 0);
   }

   private void printStackTrace(Exception var1) {
      this.logger.printStackTrace(var1, 1);
   }
}
