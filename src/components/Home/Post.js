import { Link } from 'react-router-dom';
import axios from 'axios';
import React, { useEffect, useRef, useState } from 'react'
const Post = (post) => {
  const id= useRef();
 

  const editTask=async()=>{
    
     try{
      await axios.put("http://localhost:7090/editTask/${taskid}")
     }catch(err){
      console.log(err)
     }
      
     
      
    }
    const deleteTask=async(taskid)=>{
      try{
        await axios.delete(`http://localhost:7090/delete/${taskid}`)
        window.location.reload(false);
      }catch(err){
        console.log(err)
       }
      
    }
 
  return (
  
    <div><table className="table">
    
    <tbody>
      <tr>
        <th scope="row">{post.post.taskid}</th>
        <td className="text-center">{post.post.tasktitle}</td>
        <td className="text-center">{post.post.taskdesc}</td>
        <td className='text-center'> <Link to={`/add/${post.post.taskid}`}><button className='bg-primary p-1 text-white' onClick={editTask}>Edit</button></Link>  <button className='bg-danger p-1 text-white' onClick={()=>deleteTask(post.post.taskid)}>Delete</button></td>
      </tr>
    </tbody>
  </table></div>
    
  )
}

export default Post