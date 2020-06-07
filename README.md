## Create a Bowling Game Kata

- This is a simple game of bowling.
- There are 10 pins( bottles ) and we need knock down as much as possible.
- There are three terminologies
    - Frame: frame is a set of 2 throws.
    - Gutter ball: if you are not able to hit any of the pins.
    - Spare : if you hit 10 pins with 2 balls ( for ex 6+4 ,5+5 etc. ) And then score for that frame will be 10 + nextThrow
      for example I score 5 ,5 and then I score 8 then my score will be 18 for that frame.
    - Strike : If you knock down all 10 of the pins with your one hit then its called strike. Now for that frame you need
    to count next two score for that frame. For example If I hit 10 on my 1st and then I score 5 and 6 so the score for
    that frame will be 21. (if 1st is 10 , 2nd is 10 and 3rd is 10 then score for that frame is 30)
- Perfect game : If you score all throws as 10.Then score is 300
    


References:
- [Game Rules](http://butunclebob.com/ArticleS.UncleBob.TheBowlingGameKata)
- [Video Rules Explained](https://www.youtube.com/watch?v=E2d8PizMe-8)