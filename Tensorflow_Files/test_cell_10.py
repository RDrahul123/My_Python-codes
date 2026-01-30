import random

def bigram_flip(sentence, flip_prob=0.3):
    words = sentence.split()
    result = words[:]

    for i in range(len(words) - 1):
        if random.random() < flip_prob:
            # Swap adjacent words
            result[i], result[i + 1] = result[i + 1], result[i]

    return " ".join(result)

# Example
text = "Natural language processing models learn patterns from data"
augmented_text = bigram_flip(text, flip_prob=0.4)

print("Original:", text)
print("Bigram flipped:", augmented_text)
