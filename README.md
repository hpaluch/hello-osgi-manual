# Manual example of Hello World for OSGi Equinox

This is the simplest possible example of OSGi hello world for
Equinox container. This example is based on Hello World from
"Modular Java" book.

## Setup

You need to have working OSGi Equinox container - please see 
my project https://github.com/hpaluch/OSGi-equinox-console
for such example.

Eclipse STS 3.7.3 is strongly recommended - from https://spring.io/tools/sts

* TODO: import project to eclipse

* Build jar - for example invoking Run As -> Maven install ...

* run OSGi Equinox container (see https://github.com/hpaluch/OSGi-equinox-console )

* install and test your jar in `osgi>` console, for example:

```
install file:full_path_to/target/hello-osgi-manual-0.0.1-SNAPSHOT.jar 
ss # will show IDs
start <ID>
# should display Hello started: ...
stop  <ID>
# should display Hello stopped: ...
uninstall <ID>
```


## Resources

This example is loosely based on Hello World from "Modular Java" book.

