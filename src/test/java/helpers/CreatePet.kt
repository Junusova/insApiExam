package helpers

class CreatePet {
    val pet = """
    {
      "id": 12,
      "category": {
        "id": 15,
        "name": "Sirius"
      },
      "name": "doggie",
      "photoUrls": [
        "testUrl"
      ],
      "tags": [
        {
          "id": 16,
          "name": "sweet"
        }
      ],
      "status": "available"
    }
"""
}