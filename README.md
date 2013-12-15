Secret Santa
============

helps you generate random pairs in a set where no element is paired with itself

# background

you know what the background is. your friends are coming over for an xmas dinner and you want to generate random pairs the week before to encourage some nice interaction withing the group (giving presents) after the dinner. should be easy.

turns out it is not that easy after all. at least finding a [derangement](http://en.wikipedia.org/wiki/Derangement) is not trivial.

# implementation

is rather brute force. according to this [blog post](http://cameroncounts.wordpress.com/2013/01/18/finding-derangements-without-cfsg/) there is a much more elegant algorithm. well, there is always room for improvement ;)

anyway current implementation should take
```
n! - ¡n + 1
```
worst case. There is no validation of the input either. Call it like:
```clojure
(pair-up #{:a :b :c :d :e :f :g})
```
or even
```clojure
(pair-up #{"fred" "virag" "ceri" "benedek" "matruska" "regi" "pedjar"})
```
the result should be something like:
```
(("virag" "regi")
 ("matruska" "ceri")
 ("fred" "matruska")
 ("pedjar" "virag")
 ("benedek" "pedjar")
 ("regi" "benedek")
 ("ceri" "fred"))
```
