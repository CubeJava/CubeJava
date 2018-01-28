# CubeJava
### Tools
#### createI (Creates an interface)
``` Java
createI(String title, int sizeX, int sizeY, boolean bypass);
```
So, what createI does is creates a maniputable JFrame for your application.

``` title ``` Would be the title of your frame.

``` sizeX ``` Would be the X size of your frame.

``` sizeY ``` Would be the Y size of your frame.

Generally you wouldn't want a window size bigger than 3000, so, we added ``` bypass ```. if ``` bypass ``` is set to false and your window
size is over 3000 either way(X or Y), it wont run the application. If ``` bypass ``` is set to true and either x or y(or both) or bigger
than 3000 the window will still show.
