import axios from 'axios';
import React, { useEffect, useRef, useState } from 'react'
import { Link } from 'react-router-dom';

import Post from './Post';
import Tasklist from './Tasklist';

 const Home = () => {
  const [task,setTask] = useState()
  const fetchTask=async()=>{
   
    const res = await axios("http://localhost:7090/tasks")
    setTask(res.data) 
   
    
  }
  useEffect(() => {
    fetchTask()
}, [])


  
  return (

    <div>
      <div className='topbar bg-primary p-2'> <h2>Todoapp</h2></div>
      <Link to="/add">Addtask</Link>
      <table className="table">
      <thead>
      <tr>
        <th scope="col">id</th>
        <th scope="col">title</th>
        <th scope="col">description</th>
        <th scope="col">Action</th>
      </tr>
    </thead>
      </table>
      
    
          {task && task.map((p)=>(
            <Post key={p.taskid} post={p}/>))}
      

      

     
                 
    </div>
  )
  }

  export default Home