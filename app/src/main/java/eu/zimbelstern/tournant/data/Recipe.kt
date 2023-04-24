package eu.zimbelstern.tournant.data

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity
data class Recipe(
	// Constructor for Room entity
	@PrimaryKey(autoGenerate = true)
	var id: Long,

	val gourmandId: Int?,
	val title: String,
	val description: String?,
	val category: String?,
	val cuisine: String?,
	val source: String?,
	val link: String?,
	val rating: Float?,
	val preptime: Int?,
	val cooktime: Int?,
	val yieldValue: Float?,
	val yieldUnit: String?,
	val instructions: String?,
	val notes: String?,
	val image: ByteArray?
) : Parcelable {

	// Constructor for outdoor (non-room) usage
	constructor(
		gourmandId: Int?,
		title: String,
		description: String?,
		category: String?,
		cuisine: String?,
		source: String?,
		link: String?,
		rating: Float?,
		preptime: Int?,
		cooktime: Int?,
		yieldValue: Float?,
		yieldUnit: String?,
		instructions: String?,
		notes: String?,
		image: ByteArray?
	) : this(0,
		gourmandId,
		title,
		description,
		category,
		cuisine,
		source,
		link,
		rating,
		preptime,
		cooktime,
		yieldValue,
		yieldUnit,
		instructions,
		notes,
		image
	)

}