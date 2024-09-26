# Human or Robot Test Program

This repository contains a Java program that attempts to determine whether the user is more likely to be a human or a robot based on their responses to a series of questions.

## Project Information

- **Course**: ICSI/IECE 201 - Introduction to Computer Science
- **Term**: Fall 2024
- **Lab Time**: Wednesday, 9:30 AM
- **Author**: David Omotosho
- **Net ID**: DO374676
- **Email**: domotosho@albany.edu
- **Project**: Human or Robot Test Program

## Description

The program presents the user with a series of five questions. Based on the user's responses, the program calculates the probability of the user being either a human or a robot. The final result is adjusted using a random factor derived from the user's confidence level in their answers.

The program was tested with the following sample inputs:

1. Did you cry during "Avengers: Endgame"? — Yes
2. Which is the best TV show? — Neither
3. Do you participate in viral challenges on TikTok or Instagram? — I don’t use social media
4. Do you play video games regularly? — Sometimes
5. What does it feel like to touch a hot object? — Nothing

- **Confidence Level**: 100%
- **Results**: Human 50%, Robot 0%

## How the Program Works

1. **Input**: The user is prompted to answer several questions about their preferences and behavior.
2. **Probability Calculation**: Based on the answers, the program calculates a probability for both "human" and "robot" using simple conditions.
3. **Confidence Adjustment**: The program asks for the user's confidence in their answers, and applies a random adjustment to the final probability to simulate uncertainty.
4. **Final Output**: The program outputs the likelihood of the user being human or a robot.


