# tdd-kata-fizzbuzz

The program illustrates an example of fizzbuzz, using TDD and serves as reference for my blog post on [blog.senacor.com](https://senacor.blog/coding-kata-in-der-praxis/) and [metters.dev](https://metters.dev/2022/05/10/coding-kata-2/).
Please check the commit messages, where I tried to visualise the TDD cycle:
Each commit message is preceded by a keyword _RED_, _GREEN_, or _REFACTOR_.

The solution steps of this coding kata have been optimized for the blog article. 
Without it, the solution would probably have looked quite different. 
The last few steps in particular were shortened as the point was made with the commit message before already.

The program does not contain any optimisation for edge cases like negative input values or non-integer values. 
In the end there is only one test method to test the behaviour of the whole fizzbuzz program. 
I am aware there are **parameterized tests** and **property-based test** that would test many more cases than just the one in this program.
However, this optimisation was neglected as it was not the point of this coding kata.
