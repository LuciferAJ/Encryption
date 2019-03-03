# Encryption
Basic Encryption Program in Java
function which encrypts a given string s over the alphabet {a, b, c, d, e, f, ..., z} using the formula:ai= letter ( (position(ai)+ position(ai+1) ) mod k )where: ai–ithletter in s; n –length of s; an+1 = a1, k –number of letters in the alphabetposition(letter)–sequence number of the letter in the alphabetletter(position)–letter being atthe positionin the alphabetExample: encrypt(“abc”) = “ced”
