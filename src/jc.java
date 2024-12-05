public class jc extends i5 {
   public void dA() {
      aqy var1 = aqy.if();
      this.hT.clear();
      this.hT.add(new iy(0, this.hV / 2 - 155, this.hU / 4 + 120 + 12, var1.a("gui.toMenu")));
      this.hT.add(new iy(1, this.hV / 2 - 155 + 160, this.hU / 4 + 120 + 12, var1.a("menu.quit")));
   }

   protected void a(j6 var1) {
      if (var1.hv == 0) {
         this.hW.a((i5)(new x()));
      } else if (var1.hv == 1) {
         this.hW.h2();
      }

   }

   protected void if(char var1, int var2) {
   }

   public void if(int var1, int var2, float var3) {
      this.dx();
      this.a(this.hR, "Out of memory!", this.hV / 2, this.hU / 4 - 60 + 20, 16777215);
      this.if(this.hR, "Minecraft has run out of memory.", this.hV / 2 - 140, this.hU / 4 - 60 + 60 + 0, 10526880);
      this.if(this.hR, "This could be caused by a bug in the game or by the", this.hV / 2 - 140, this.hU / 4 - 60 + 60 + 18, 10526880);
      this.if(this.hR, "Java Virtual Machine not being allocated enough", this.hV / 2 - 140, this.hU / 4 - 60 + 60 + 27, 10526880);
      this.if(this.hR, "memory. If you are playing in a web browser, try", this.hV / 2 - 140, this.hU / 4 - 60 + 60 + 36, 10526880);
      this.if(this.hR, "downloading the game and playing it offline.", this.hV / 2 - 140, this.hU / 4 - 60 + 60 + 45, 10526880);
      this.if(this.hR, "To prevent level corruption, the current game has quit.", this.hV / 2 - 140, this.hU / 4 - 60 + 60 + 63, 10526880);
      this.if(this.hR, "We've tried to free up enough memory to let you go back to", this.hV / 2 - 140, this.hU / 4 - 60 + 60 + 81, 10526880);
      this.if(this.hR, "the main menu and back to playing, but this may not have worked.", this.hV / 2 - 140, this.hU / 4 - 60 + 60 + 90, 10526880);
      this.if(this.hR, "Please restart the game if you see this message again.", this.hV / 2 - 140, this.hU / 4 - 60 + 60 + 99, 10526880);
      super.if(var1, var2, var3);
   }
}
