import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import javax.imageio.ImageIO;

class k4 extends Canvas {
   private BufferedImage a;

   public k4() {
      try {
         this.a = ImageIO.read(k6.class.getResource("/gui/crash_logo.png"));
      } catch (IOException var2) {
      }

      byte var1 = 100;
      this.setPreferredSize(new Dimension(var1, var1));
      this.setMinimumSize(new Dimension(var1, var1));
   }

   public void paint(Graphics var1) {
      super.paint(var1);
      var1.drawImage(this.a, this.getWidth() / 2 - this.a.getWidth() / 2, 32, (ImageObserver)null);
   }
}
