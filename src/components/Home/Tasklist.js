import React from 'react'

const Tasklist = (post) => {
  return (
    <div>
      <table>
        <thead>
            <tr>
              <td>id</td>
              <td>title</td>
              <td>desc</td>
            </tr>
        </thead>
            <tr>
            <td>{post.post.id}</td>
            <td>{post.post.title}</td>
            <td>{post.post.desc}</td>
          </tr>
      </table>
    </div>
  )
}

export default Tasklist