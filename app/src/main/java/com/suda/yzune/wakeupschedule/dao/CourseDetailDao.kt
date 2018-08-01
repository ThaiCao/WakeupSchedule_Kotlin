package com.suda.yzune.wakeupschedule.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*
import com.suda.yzune.wakeupschedule.bean.CourseBaseBean
import com.suda.yzune.wakeupschedule.bean.CourseDetailBean

@Dao
interface CourseDetailDao {

    @Insert
    fun insertCourseDetail(courseDetailBean: CourseDetailBean)

    @Insert
    fun insertList(courseDetailList: List<CourseDetailBean>)

    @Query("select * from coursedetailbean")
    fun getAll(): LiveData<List<CourseDetailBean>>

    @Query("select * from coursedetailbean where id = :id")
    fun getDetailById(id: Int): LiveData<List<CourseDetailBean>>

    @Query("delete from coursedetailbean where tableName = :tableName")
    fun deleteByTableName(tableName: String)

    @Update
    fun updateCourseDetail(courseDetailBean: CourseDetailBean)

    @Delete
    fun deleteCourseDetail(courseDetailBean: CourseDetailBean)
}