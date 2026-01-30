from transformers import pipeline

print("Loading pipelines...")
# Load translation pipelines
en_to_fr = pipeline("translation_en_to_fr", model="Helsinki-NLP/opus-mt-en-fr")
fr_to_en = pipeline("translation_fr_to_en", model="Helsinki-NLP/opus-mt-fr-en")
print("Pipelines loaded.")

def back_translate(sentence):
    # Step 1: English → French
    french = en_to_fr(sentence)[0]["translation_text"]

    # Step 2: French → English
    back_english = fr_to_en(french)[0]["translation_text"]

    return back_english

# Example
text = "Natural language processing is transforming modern AI."
augmented_text = back_translate(text)

print("Original:", text)
print("Back translated:", augmented_text)
