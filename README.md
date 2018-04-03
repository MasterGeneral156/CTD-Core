# CTD Core [![](http://cf.way2muchnoise.eu/full_ctd-core_downloads.svg)](https://minecraft.curseforge.com/projects/ctd-core) [![](http://cf.way2muchnoise.eu/versions/ctd-core.svg)](https://minecraft.curseforge.com/projects/ctd-core)
A library mod for CTD Mods. This handles model registration and other mod magic.  
## CurseForge 
https://minecraft.curseforge.com/projects/ctd-core  
## Using as Dependency  
In your mod workspace, create a folder called `libs`, and drag in the latest CTD Core jar files. You need both the release and source jars! (You may find these using the CurseForge link above!)  
From there, in your mod's main class, include:
`public static final String DEPENDENCIES = "required-after:ctdcore@[1.2.1,];";`, replacing `1.2.1` with the version you need at minimum. Be sure you add that declartion to your mod's dependencies in `@Mod`
