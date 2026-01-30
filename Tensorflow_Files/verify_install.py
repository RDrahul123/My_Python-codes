try:
    import transformers
    import torch
    import sentencepiece
    print("SUCCESS: transformers, torch, and sentencepiece imported.")
except ImportError as e:
    print(f"FAILURE: {e}")
