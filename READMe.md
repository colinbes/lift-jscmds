Demo JsCmds code
=================
Demonstration project showing failure of JsCmds.RedirecTo to add context when called from within Comet Actor

Compiled against Scala 2.10.2, Lift 2.5.1 using Maven 3.0.4 on Eclipse Juno

Project runs on jetty and can be executed using mvn jetty:run

Once running, point browser to http://localhost:8080/ctx, the context "ctx" being set in pom.xml

The default opening index.html includes 3 buttons, two using JsCmds.RedirectTo and one using S.redirectTo. All three of these links work.

Clicking on menu item "comet" opens the comet page with three links, all three using JsCmds.RedirectTo. The third link uses fiddled (manually adding) prepending of context path.

Clicking on first two buttons fails showing 'ctx' context is not added to path as it is in non-comet pages



