package helpers

class CreatePet {
    val pet = """
    {
      "id": 12,
      "category": {
        "id": 12,
        "name": "Sirius"
      },
      "name": "doggie",
      "photoUrls": [
        "testUrl"
      ],
      "tags": [
        {
          "id": 12,
          "name": "sweet"
        }
      ],
      "status": "available"
    }
""".trimIndent()
}