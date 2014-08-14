package net.minecraft.src
  
public class mod_Template extends BaseMod
{
  public static final Item mkItem;
  
  static{
    lightningPearl = new mkItem(5000).setUnlocalizedName("westernchair.png")
  }
  
  public String getVersion()
  {
    return "Version: 1.0";
  }
  
  public void load() {}
}

public class lightningPearl(int par1){
  super(par1)
}
