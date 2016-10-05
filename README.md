# IS2545 The title "IS2545 - DELIVERABLE 2: Unit Testing"

In deliverable 2, first according to the FUN-ARGS, I think it needs to determine whether the input is an integer So here I chose to set an isInteger function, it also asks only when the number of arguments equals to one, the program can successfully pass, so I combine isInteger and args.length together to realize it. As for the visitor types and locations, I use the same methods to store them in separate files, and use Boolean method (via a matrix) to record each visitor’s preference to every location. The FUN-ITERATIONS, here I chose the Math.random to generate the random number in my program for it can be friendly applied with my other classes. And the output of this program, I design it follow the sample-output in your GitHub of both the welcome word and the stop message. 

In my program, I design 7 test cases, not only the generator, but also test when the visitor type, the location and preference are assigned to another. Actually at first I did not recognize I have to add the mockito into my library, all my test cases go wrong. Later I discussed it with my classmates, they pointed it to me, which really helps me a lot.

I think in this deliverable, I learn a lot from the JUnit and mockito, I never know them before, but really help a lot in program testing. I think I will keep learn them in my following study.
