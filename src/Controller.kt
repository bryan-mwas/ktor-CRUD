package com.crud

import java.util.*

data class Author(var id: Int, val name: String, val website: String, val createdAt: Date = Date())