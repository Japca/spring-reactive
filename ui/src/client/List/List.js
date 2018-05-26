import React, { Component } from 'react'
import CSSModules from 'react-css-modules'
import styles from './list.css'
import Item from '../Item/Item.js'
import classNames from 'classnames'

@CSSModules(styles, {allowMultiple:true})
class List extends Component {

    render() {
        console.info('List')
        let items = ['item1', 'item2', 'item3', 'item4']
        return (
            <div styleName='list-container'>
                {items.map(item => <Item key={item} text={item} />)}
            </div>
        )
    }
}


export default List