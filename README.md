# CTD Core [![](http://cf.way2muchnoise.eu/full_ctd-core_downloads.svg)](https://minecraft.curseforge.com/projects/ctd-core) [![](http://cf.way2muchnoise.eu/versions/ctd-core.svg)](https://minecraft.curseforge.com/projects/ctd-core)
CTD Core is NOT a core mod. Its actually just a library mod... I know, how misleading! CTD Core simply adds handlers used by mods created by myself and other members of Chase the Dragon. It makes our life easier, y'know?
## Using as Dependency  
Include the CurseForge Maven in the `repostiories` of  your `build.gradle`
```
repositories {
  maven {
    url "https://cursemaven.com"
      content {
        includeGroup "curse.maven"
      }
    }
}
```
In dependencies on `build.gradle` (after Minecraft Forge) add:
```
implementation fg.deobf('curse.maven:ctd-core-' + project.property('ctd_core_ver'))
```
Add the following to your `gradle.properties` replacing `3848196` with the File ID from CurseForge of the CTD Core version you wish to use. (See below image for example)
```
ctd_core_ver=258186:3848196
```
![how to ctd core](https://chivalryisdeadgame.com/assets/img/etc/how-to-ctd-core.png)

## Downloads
[CurseForge](https://minecraft.curseforge.com/projects/ctd-core) | [PlanetMC](https://www.planetminecraft.com/mod/ctd-core/) | [Modrinth](https://modrinth.com/mod/ctd-core)
